import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int pesobag;

        System.out.println("Insira o peso de sua bagagem, em kg.");
        pesobag = ler.nextInt();

        if (pesobag > 20) {
            System.out.println("Caso o peso passe de 20kg, será cobrado R$5 a mais por cada kg, você vai pagar R$" + 
            (pesobag - 20) * 5);  
        } else { 
            System.out.println("Você não pagará nenhum custo adicional.");
        }

    }
    
}
