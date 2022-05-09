import java.util.Scanner;
/* faça um programa que peça x numeros inteiros, calcule e mostre a quantidade de numeros pares e a quantidade
* de numeros impares*/
public class Par_impar {

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        int quantNumeros , soma=0;
        int contador=0;
        int numeros=0;
        int quantPares = 0, quantImpares = 0;

        System.out.println("quantidade de numeros");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("numeros:");
            numeros = scan.nextInt();
            if (numeros % 2 ==0) quantPares++;
            else  quantImpares++;


            contador++;
            soma = (soma+numeros) ;


        }while(contador < quantNumeros);
        System.out.printf("A soma dos numeros foi:" + soma);
        System.out.printf("\nQuantidade de numeros pares:" + quantPares);
        System.out.printf("\nQuantidade de numeros impares:" + quantImpares);

    }


}
