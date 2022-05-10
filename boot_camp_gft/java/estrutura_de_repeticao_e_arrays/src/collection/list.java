package collection;

import java.util.*;

public class list {
    public static void main(String[] args) {
        System.out.println("crie uma lista e adicione as sete notas");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d); /*para adicionar uma nota */
        System.out.println(notas);

        System.out.println("substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d),  6.0);/*para substituir uma nota por outra*/
        System.out.println(notas);

        System.out.println("confira se a nota 5.0 esta na lista: " + notas.contains(5d));

        System.out.println("exiba todas as notas na ordem em que fora informados");
        for (Double nota : notas ) System.out.print(nota + " / ");

        System.out.println("\nexiba a terceira nota adicionada: " + notas.get(2));/*para descobrir a posição*/

        System.out.println("exiba a menor nota" + Collections.min(notas));/*para exibir a menor nota*/

        System.out.println("exiba a maior nota " + Collections.max(notas));/*para exibir a maior nota*/


        Iterator<Double> iterator = notas.iterator();
        Double soma=0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;

        }
        System.out.println("exiba a soma dos valores:" + soma);

        System.out.println("exiba a media das notas " + (soma/notas.size()));/* notas.size ve quantas notas tem dentro */

        System.out.println("a quantia de notas dentro da caixa é : " + notas.size());/*mesma observação do anterior*/

        System.out.println("remova a nota 0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("a quantia de notas dentro da caixa é : " + notas.size());

        System.out.println("remova a nota da posição zero");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("remova as notas menores que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
           Double next = iterator1.next();
           if (next < 7 )iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("apague todas as notas");
        notas.clear();/*para apagar todos os valores dentro da lista*/
        System.out.println(notas);



    }
}
