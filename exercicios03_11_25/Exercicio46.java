package exercicios03_11_25;

import java.util.Scanner;

public class Exercicio46 { // Digite dez números e descubra o maior e o menor. 

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        int numero, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        for(int i=0; i<=9; i++){
            System.out.println("Digite o " + (i + 1) + ("° número."));
            numero = ler.nextInt();
            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
    } 
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);

    }
    
}
