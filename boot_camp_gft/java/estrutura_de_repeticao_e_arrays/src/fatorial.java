import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador ;
        int numero;
        int multiplicacao = 1;
        System.out.println("digite um numero");
        numero = scan.nextInt();

        System.out.println(numero + "!=");
        for (contador = numero; contador >= 1; contador--) {
            multiplicacao = multiplicacao * contador;
        }
        System.out.println(multiplicacao);


    }


}
