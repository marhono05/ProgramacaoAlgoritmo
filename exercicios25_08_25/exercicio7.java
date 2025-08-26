import java.util.Scanner;

public class exercicio7 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int bolas;
        double preco, total;

        System.out.println("Quantas bolas de sorvete você quer?");

        bolas = ler.nextInt();

        System.out.println("Qual o valor de cada bola de sorvete?");

        preco = ler.nextDouble();

        total = bolas * preco;

        System.out.println("O valor total é de " + total + " reais.");


    }
}
