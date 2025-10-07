import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int kwhconsumidos, contafinal;

        System.out.println("Digite a quantidade de kWh consumidos.");
        kwhconsumidos = ler.nextInt();

        if (kwhconsumidos > 100) {
            System.out.println("Você pagará ao todo: RS$" + (((kwhconsumidos - 100) * 0.75) + (100 * 0.50)));
        } else {
            System.out.println("O valor da conta é de: R$" + kwhconsumidos * 0.50);

        }


    
    }


    
}
