package exercicios03_11_25;

import java.util.Scanner;

public class Exercicio47 { // Um programa que conte quantos números são ímpares e quantos são pares

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int numero, impar = 0, par = 0; // Sempre que usar eles para qualquer cálculo, definiar a variável para 0
        for(int i=0; i<=9; i++ ){
            System.out.println("Digite o " + (i + 1) + ("° número."));
            numero = ler.nextInt();
            if(numero % 2 == 0 ){  // % Significa resto da divisão
                par++; // Mesma coisa que par = par + 1, ou seja, que vai aumentar de 1 em 1
            }
            if(numero % 2 == 1){
                impar++;
            }
        }
        System.out.println("A quantidade de números ímpares é: " + impar);
        System.out.println("A quantidade de números pares é: " + par);




    }
    
}
