import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int nota1, nota2, media;

        System.out.println("Digite a primeira nota");
        nota1 = ler.nextInt();

        System.out.println("Digite a segunda nota");
        nota2 = ler.nextInt();

        media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Você foi reprovado");
        }

    }
}
