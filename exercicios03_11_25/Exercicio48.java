package exercicios03_11_25;

import java.util.Scanner;

public class Exercicio48 { // Programa que soma todos os números positivos e separadamente some os números negativos
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int numero, positivo = 0, negativo = 0;
        for(int i=0; i<=9; i++){
            System.out.println("Digite o " + (i + 1) + ("° número."));
            numero = ler.nextInt();
            if(numero < 0){
                negativo += numero; // negativo = negativo + numero;
            }else{
                positivo += numero;               
            }       
            }
            System.out.println("A soma de todos os números positivos é: " + positivo);
            System.out.println("A soma dos números negativos é: " + negativo);

        }

    }
