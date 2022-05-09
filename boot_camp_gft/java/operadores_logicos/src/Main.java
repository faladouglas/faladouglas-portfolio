import java.util.Scanner;

public class Main {

    public static void  main(String[] arsg){
        Scanner entrada = new Scanner(System.in);
        int idade ;
        float a ,b;

        System.out.println("digite sua Idade:");
        idade = entrada.nextInt();

        if (idade >=18 && idade <50 ) {
            System.out.println("entrada autorizada");
        }

         else {
            System.out.println("entrada não autorizada");

        }



        System.out.println("digite sua senha de 6 numeros");
        a = entrada.nextFloat();
        System.out.println("digite sua senha novamente");
        b = entrada.nextFloat();

        if (a == b ){

            System.out.println("senha cadastrada com sucesso");
        }

        else {
            System.out.println("senha digitada diferente");




        }



        /*System.out.printf("a soma de %d + %d = %d",a,b, res);*/






    }
}
