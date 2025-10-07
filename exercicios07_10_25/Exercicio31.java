package exercicios07_10_25;

import java.util.Scanner;

public class Exercicio31 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int kwhconsumidos;
        
        System.out.println("Insira a quantidade de kWh consumidos!");
        kwhconsumidos = ler.nextInt();

        if (kwhconsumidos > 200) {
            System.out.println("O preço do kWh é de R$ 0,30, ao todo você pagará: R$" + (kwhconsumidos * 0.30));    
        } else {
            System.out.println("O preço do kWh é de R$ 0,20, você pagará ao todo: R$" + (kwhconsumidos * 0.20));
        }

    

        
    }
    
}
