import java.util.Scanner;

public class arrays_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoante = new String[6];
        int quantidadeConsoantes = 0 ;
        int contador = 0;

        do {
            System.out.println("letra");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase( "a")||
                    letra.equalsIgnoreCase( "e")||
                    letra.equalsIgnoreCase( "i")||
                    letra.equalsIgnoreCase( "o")||
                    letra.equalsIgnoreCase( "u"))){
                consoante[contador] = letra;
                quantidadeConsoantes++;
            }


            contador++;

        }while(contador < consoante.length);
        System.out.println("consoantes");
        for (  String consoantes : consoante ) {
            if ( consoantes != null)
            System.out.print(consoantes + " ");


        }
        System.out.println("quantidade de consoantes:" + quantidadeConsoantes);

    }
}
