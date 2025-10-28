package exercicios28_10_25;

import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int operacao;
        double n1, n2, result;

        System.out.println("Digite o primeiro número.");
        n1 = ler.nextDouble();
        System.out.println("Insira o segundo número.");
        n2 = ler.nextDouble();
        System.out.println("Escolha a operação desejada.");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        operacao = ler.nextInt();

        switch (operacao) {
            case 1: {
                result = n1 + n2;
                System.out.println("O resultado é " + result);
                break; }
            case 2: {
                result = n1 - n2;
                System.out.println("O resultado é " + result);
                break; }
            case 3: {
                result = n1 * n2;
                System.out.println("O resultado é " + result);
                break; }
            case 4: {
                result = n1 / n2;
                System.out.println("O resultado é " + result);
                break; 
            }
            default:
                System.out.println("Operação inválida.");
                break;
        }
        
        
    }
}