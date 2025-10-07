package exercicios07_10_25;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double metavendas, valorvendido, valorbonus10, valorbonus3;

        System.out.println("Insira o valor da meta de vendas!");
        metavendas = ler.nextDouble();

        System.out.println("Insira o valor real vendido pelo funcionário!");
        valorvendido = ler.nextDouble();

        if (valorvendido >= metavendas) {
            valorbonus10 = valorvendido * 0.10;
            System.out.println("Você bateu a meta, parabéns!, receberá um bônus de 10%! no valor de: R$" + valorbonus10);
            System.out.println("Ao todo você receberá por essa venda: R$" + (valorbonus10 + valorvendido));         
        } else {
            valorbonus3 = valorvendido * 0.03;
            System.out.println("Você não atingiu a meta, receberá um bônus de 3% apenas, no valor de: R$" + valorbonus3);
            System.out.println("Ao todo você receberá por essa venda: R$" + (valorbonus3 + valorvendido));

        }
    }
    
}
