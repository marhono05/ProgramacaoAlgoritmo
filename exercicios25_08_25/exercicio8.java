import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double notaum, notadois, notatres, media;

        System.out.println("Digite o valor da primeira nota");

        notaum = ler.nextDouble();

        System.out.println("Digite o valor da segunda nota");

        notadois = ler.nextDouble();

        System.out.println("Digite o valor da terceira nota");

        notatres = ler.nextDouble();

        media = notaum + notadois + notatres / 3;

        System.out.println("A média das suas notas é " + media);



    }
    
}
