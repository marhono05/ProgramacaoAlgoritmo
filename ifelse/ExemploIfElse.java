import java.util.Scanner;

public class ExemploIfElse {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.println("Qual sua idade?");
        idade = ler.nextInt();

        if (idade < 18) {
            System.out.println("Você é menor de idade!");
        } else {
            System.out.println("Você é de maior");
        }

        
    }
}