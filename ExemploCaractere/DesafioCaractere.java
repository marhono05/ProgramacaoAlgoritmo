package ExemploCaractere;

import java.util.Scanner;

public class DesafioCaractere { // Digitar uma palavra e inverter ela

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String palavra;
        int i;

        System.out.println("Digite uma palavra");
        palavra = ler.next();

        for (i = palavra.length() - 1; i >= 0; i--) {
            ; // Vai pegar da última letra até a primeira e ir diminuindo
            System.out.print(palavra.charAt(i));

        }

    }
}
