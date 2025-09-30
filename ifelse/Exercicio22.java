import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println("Digite o seu número");
        numero = ler.nextInt();

        if (numero < 0) {
            System.out.println("O seu número é negativo");
        } else {
            System.out.println("O seu número é positivo");
        }

    }
}