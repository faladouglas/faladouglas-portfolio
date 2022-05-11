package collection_Set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));/*nao repeti valores e nao apresenta ordem HASHSET*/
        System.out.println(notas.toString());

      /*  System.out.println("exiba a posição da nota 5.0");
        não é possivel usando a interface set
        System.out.println("adicione na lista a nota 8.0 na posição 4:");
        não é possivel usando a interface set
        System.out.println("substitua a nota 5.0 pela nota 6.0");
        não é possivel usando a interface set*/

        System.out.println("Confira se a nota 5.0 esta no conjunto: " + notas.contains(5d));

        /*System.out.println("exiba a terceira nota adicionada");
         não é possivel usando a interface set*/

        System.out.println("exiba a menor nota: " + Collections.min(notas));

        System.out.println("exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " +soma);

        System.out.println("Exiba a media das notas: " + (soma/notas.size()));

        System.out.println("remova a nota 0.0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));/*obrigatorioo usar o LinkedHashSet*/
        System.out.println("exiba as notas na ordem que foram informadas");
        System.out.println(notas2);

        System.out.println("exiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);/*TreeSet organiza de forma natural os valores obs Double tem a caracteristica compareble */
        System.out.println(notas3);


        System.out.println("apague todo o conjunto");
        notas.clear();


        System.out.println("virifique se existe itens dentro dos conjuntos 1 " + notas.isEmpty());
        System.out.println("virifique se existe itens dentro dos conjuntos 2 " + notas2.isEmpty());
        System.out.println("virifique se existe itens dentro dos conjuntos 3 " + notas3.isEmpty());



        


    }

}
