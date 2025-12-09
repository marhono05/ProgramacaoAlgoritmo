package ExemploVetor;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploVetor1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numeros[] = new int[10];
        int i, posicao;

        // Descobrir qual número está em determinada posição
        for (i = 0; i <= 9; i++) {
            System.out.println("Digite um número para a posição " + i + " do vetor.");
            numeros[i] = ler.nextInt();
        }
        System.out.println("Digite qual posição deseja visualizar / [0 - 9]");
        posicao = ler.nextInt();

        System.out.println("O valor que está na posição " + posicao + " é o " + numeros[posicao]);

        System.out.println("**********************************");
        System.out.println("Esses são os 10 valores do vetor");

        // Exibir todos os números digitados no vetor
        for (i = 0; i <= 9; i++) {
            System.out.print(numeros[i] + ", ");
        }

        int menor = Arrays.stream(numeros).min().getAsInt(); //Pega o menor valor da variável numeros
        int maior = Arrays.stream(numeros).max().getAsInt(); //Pega o maior valor da variável numeros
        double media = Arrays.stream(numeros).average().getAsDouble(); //Faz a media dos números dentro da variável numeros
        int soma = Arrays.stream(numeros).sum(); //Faz a soma de todos os números dentro da variável numeros

        System.out.println("O menor número do vetor é " + menor);
        System.out.println("O maior número do vetor é " + maior);
        System.out.println("A média de números do vetor é de " + media);
        System.out.println("A soma dos números do vetor é " + soma);

        Arrays.sort(numeros); //Ordena os números em ordem crescente

        System.out.println("Os números do vetor em ordem crescente é: ");
        System.out.println(Arrays.toString(numeros)); 



    }
}
