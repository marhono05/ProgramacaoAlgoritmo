package exercicios13_10_25;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double n1, n2, media;

        System.out.println("Digite a primeira nota.");
        n1 = ler.nextDouble();

        System.out.println("Digite a segunda nota.");
        n2 = ler.nextDouble();

        media = (n1 + n2) / 2;

        if (media >= 7) {
            System.out.println("Sua média foi: " + media +  " Você está aprovado, parabéns!");    
        } else if (media < 7 && media >= 5) {
            System.out.println("Sua média foi de: " + media + " Você está de recuperação.");
            
        } else {
            System.out.println("Sua média é de: " + media + " Você foi reprovado.");
        }


    }
    
}
