import java.util.Scanner;

public class laco_for_tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador=0;
        int numero;
        System.out.println("digite o numero da tabuada:");
        numero = scan.nextInt();

        for (contador=1; contador <=10 ; contador++){


            System.out.printf (numero + "x" + contador +"=" + (numero*contador) +"\n");
        }


    }
}
