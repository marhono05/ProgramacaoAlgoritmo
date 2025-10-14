package exercicios13_10_25;

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double salariomensal, impos10, impos20;

        System.out.println("Insira o valor do seu salário.");
        salariomensal = ler.nextDouble();

        impos10 = (salariomensal * 0.10);
        impos20 = (salariomensal * 0.20);

        if (salariomensal < 2000) {
            System.out.println("Você não pagará nenhum imposto!");
        } else if (salariomensal > 2001 && salariomensal < 4000) {
            System.out.println("Você pagará 10% de imposto, ou seja, R$" + impos10);
        } else {
            System.out.println("Você pagará 20% de imposto, ou seja, R$" + impos20); 
        }

    }

}
