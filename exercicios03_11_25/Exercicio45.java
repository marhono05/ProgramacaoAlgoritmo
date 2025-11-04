package exercicios03_11_25;

import java.util.Scanner;

public class Exercicio45 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int quantidade;
        double soma = 0;
        int numero;
        


        for(quantidade=1; quantidade<=10; quantidade++) { System.out.println("Digite 10 números"); numero = ler.nextInt();
        soma = soma + numero; }

        double media = soma / 10;
        
        System.out.println("A soma de todos os números é " + soma);
        System.out.println("A média aritmética é de " + media);

    

        

    
        
    

}
}
