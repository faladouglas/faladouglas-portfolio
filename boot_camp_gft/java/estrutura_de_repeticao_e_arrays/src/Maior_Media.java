import java.util.Scanner;
/*pegue 5 notas e faça a media entre elas , mostre tbm a maior nota informada*/
public class Maior_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, contador = 0 , maior = 0 , soma = 0;



        do{
            System.out.println("digite um numero ");
            numero = scan.nextInt();

            soma= (soma + numero);

            if(numero > maior) maior=numero;

            contador = contador + 1 ;


        }while(contador < 5);

        System.out.println("Sua maior nota foi :" + maior  +"\nSua media foi:" + soma /5);




    }
}
