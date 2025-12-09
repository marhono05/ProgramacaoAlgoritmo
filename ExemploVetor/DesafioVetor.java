package ExemploVetor;

import java.util.Scanner;

public class DesafioVetor { // Criar vetor com 10posições, precisa imprimir "o vetor possui "x" números
    // pares", "São eles ..."

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n[] = new int[10];
        int i, par = 0;

        for (i = 0; i <= 9; i++) {
            System.out.println("Digite um número para a posição " + i + " do vetor.");
            n[i] = ler.nextInt();
            if (n[i] % 2 == 0) {
                par++;
            }
        }
        System.out.println("O número de valores pares digitados é de " + par + " valores.");
        System.out.println("Esses são os " + par + " números pares.");
        for (i = 0; i <= 9; i++) {
            if (n[i] % 2 == 0) {
                System.out.print(n[i] + ", "); // Tirar o LN imprime um do lado do outro
            }
        }
    }
}
