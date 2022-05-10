import java.util.Scanner;

public class array_ordem_inversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetor = {0,-5,15,50,8,4};
        int contador =0;
        System.out.println("vetor:");
        while(contador < (vetor.length)){
            System.out.print(vetor[contador]+" ");
            contador++;
        }
        System.out.println("\nvetor inverso:");
        for (contador = (vetor.length -1); contador >= 0; contador--){
            System.out.printf(vetor[contador]+" ");
        }


    }
}
