package exercicios25_11_25;

import java.util.Scanner;

public class Exercicio50 { // Calcular e escrever a média aritmética/soma dos números pares, deve sair do
                           // programa quando for digitado o 0

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n, quantpares = 0, soma = 0;
        double media;

        System.out.println("Digite um número!");
        System.out.println("Digite 0 para sair");
        n = ler.nextInt();

        while (n != 0) { // != Significa diferente ou igual, vai ler até ser digitado o 0
            if (n % 2 == 0) { // SE o resto da divisão for 0 (ou seja par)
                soma += n; // Está somando oq já foi digitado junto com o novo número digitado
                quantpares++; // Cada vez que um número for digitado, ele vai adicionar +1 no CONT
            }
            System.out.println("Digite um número!");
            System.out.println("Digite 0 para sair");
            n = ler.nextInt();
        }
        if (quantpares > 0) {
            media = soma / quantpares;
            System.out.println("A soma de todos os números pares é: " + soma);
            System.out.println("A média aritmética dos números é: " + media);
        } else {
            System.out.println("Nenhum número par foi digitado!");
        }
    }

}
