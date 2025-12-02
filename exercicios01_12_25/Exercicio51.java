package exercicios01_12_25;

import java.util.Scanner;

public class Exercicio51 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double n1, n2, resultado;
        int opcao;

        while (true) {

            System.out.println("Digite o 0 para sair");
            System.out.println("Digite o primeiro operando.");
            n1 = ler.nextDouble();
            System.out.println("Digite o segundo operando.");
            n2 = ler.nextDouble();

            if (n1 == 0 && n2 == 0) { // Se um dos números digitados for 0, vai fechar o programa
                System.out.println("Encerrando o programa...");
                break;
            }
            System.out.println("Digite uma das opções abaixo:");
            System.out.println("1 - Soma");
            System.out.println("2 - Multiplicação");
            System.out.println("3 - Divisão");
            System.out.println("4 - Potência");
            opcao = ler.nextInt();

            resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = n1 + n2;
                    break;
                case 2:
                    resultado = n1 * n2;
                    break;
                case 3:
                    if (n1 == 0 || n2 == 0) { // || significa OU, os operadores não podem ser zero
                        System.out.println("Erros: operandos não podem ser zero.");
                        continue; // Ignora a parte de baixo e volta pra cima mais uma vez
                    }
                    resultado = n1 / n2;
                    break;
                case 4:
                    resultado = Math.pow(n1, n2);
                    break;
                default: // Se nenhuma das opções for digitadas...
                    System.out.println("Opção inválida");
                    continue;

            }
            System.out.println("O resultado é: " + resultado);
        }
    }
}
