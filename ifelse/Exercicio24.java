import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite o primeiro número");
        numero1 = ler.nextInt();

        System.out.println("Digite o segundo número");
        numero2 = ler.nextInt();

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior que o número " + numero2);
        } else {
            System.out.println("O número " + numero2 + " é maior que o número " + numero1);
        }

    }
}

//informe o valor da compra e a forma de pagamento (1 para cartão (acréscimo de 5%) ou 2 (desconto de 5%) para pix)
