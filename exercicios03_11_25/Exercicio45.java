package exercicios03_11_25;

import java.util.Scanner;

public class Exercicio45 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int i, numero;
        double media = 0, soma = 0;
        
        for(i=0; i<=9; i++) { 
        System.out.println("Digite o " + (i + 1) + ("° número."));
        numero = ler.nextInt();
         soma = soma + numero;}

        media = soma / 10;
        
        System.out.println("A soma de todos os números é " + soma);
        System.out.println("A média aritmética é de " + media);

    

        

    
        
    

}
}
