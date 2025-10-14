package exercicios13_10_25;

import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double valortotal, desc10, desc15, desc20;

        System.out.println("Insira o valor total da compra.");
        valortotal = ler.nextDouble();

        desc10 = valortotal * 0.10;
        desc15 = valortotal * 0.15;
        desc20 = valortotal * 0.20;

        if (valortotal < 100) {
            System.out.println("Nenhum desconto foi aplicado!");
        } else if (valortotal > 100 && valortotal < 500) {
            System.out.println("Você recebeu 10% de desconto, no valor de R$" + desc10 +
                    " Você pagará ao todo R$" + (valortotal - desc10));
        } else if (valortotal > 500 && valortotal < 1000) {
            System.out.println("Você recebeu 15% de desconto, no valor de R$" + desc15 +
            " Você pagará ao todo R$" + (valortotal - desc15));
        } else {
            System.out.println("Você recebeu 20% de desconto, no valor de R$" + desc20 +
             " Você pagará ao todo R$" + (valortotal - desc20));
        }

    }

}
