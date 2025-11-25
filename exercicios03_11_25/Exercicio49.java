package exercicios03_11_25;

import java.util.Scanner;

public class Exercicio49 { // Soma dos números ímpares e pares e a difrença entre eles

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int numero, par = 0, impar = 0;
        for(int i=0; i <=9; i++ ){
            System.out.println("Informe o " + (i + 1) + ("° número."));
            numero = ler.nextInt();
            if(numero % 2 == 0){
                par += numero;
            }else{
                impar += numero;
            }

        }
        System.out.println("A soma dos números ímpares é de: " + impar);
        System.out.println("A soma dos números pares: " + par);
        System.out.println("A diferença entre as somas é de: " + (par - impar));
    }
    
}
