package exercicios07_10_25;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double valortotal, valorfrete, descontofrete;

        System.out.println("Insira o valor total da compra!");
        valortotal = ler.nextDouble();

        System.out.println("Insira o valor do frete!");
        valorfrete = ler.nextDouble();

        if (valortotal > 500) {
            descontofrete = valorfrete * 0.50;
            System.out.println("Você ganhou 50% de desconto no frete, o valor do frete final é de: R$" + descontofrete);
            System.out.println("Você pagará ao todo: R$" + (valortotal + descontofrete)); 
        } else {
            System.out.println("Você pagará ao todo: R$" + (valortotal + valorfrete));
        }
        
    }
    
}
