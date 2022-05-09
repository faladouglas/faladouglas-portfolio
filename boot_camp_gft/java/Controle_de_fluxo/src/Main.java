import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
    int mes ;


    System.out.println("digite o mes desejavel em valor numerico de 1 a 12 :");
    mes = entrada.nextInt();

    if (mes == 1){
        System.out.println("janeiro");
    } else if (mes == 2) {
        System.out.println("fevereiro");
    }

    else if (mes == 3) {
        System.out.println("março");
        }
    else if (mes == 4) {
        System.out.println("abril");
    }
    else if (mes == 5) {
        System.out.println("maio");
    }
    else if (mes == 6) {
        System.out.println("junho");
    }
    else if (mes == 7) {
        System.out.println("julho");
    }
    else if (mes == 8) {
        System.out.println("agosto");
    }
    else if (mes == 9) {
        System.out.println("setembro");
    }
    else if (mes == 10) {
        System.out.println("outubro");
    }
    else if (mes == 11) {
        System.out.println("novembro");
    }
    else if (mes == 12) {
        System.out.println("Uhull dezembro chegou... \nvai devagar com a bebida e o peso da balança em =P");
    }
    else {
        System.out.println("erro");
        System.
    }
        teste();
    }


    public static void teste() {
        Scanner entrada1 = new Scanner(System.in);

        int a;
        System.out.println("<---SWITCH-CASE --->\n digite o numero do mes de 1 a 12:");
        a = entrada1.nextInt();
        switch (a) {
            case 1:
                System.out.println("janeiro");
                break;
            case 2:
                System.out.println("fevereiro");
                break;
            case 3:
                System.out.println("março");
                break;
            case 4:
                System.out.println("abril");
                break;
        }

}


    }
