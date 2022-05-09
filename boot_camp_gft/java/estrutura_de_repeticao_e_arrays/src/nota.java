import java.util.Scanner;

public class nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Digite sua nota de 0 a 10: ");
        nota = scan.nextInt();

        while (nota<0 || nota >10){

            System.out.println("nota invalida, digite novamente " );
            nota = scan.nextInt();




        }

    }



}
