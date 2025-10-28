package exercicios28_10_25;

import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int bandeira;
        double consumomensal, total;

        System.out.println("Digite a cor da bandeira tarifária.");
        System.out.println("1 - Verde"); 
        // +0%
        System.out.println("2 - Amarela");
        // +10%
        System.out.println("3 - Vermelha");
        // +25%
        bandeira = ler.nextInt();
        System.out.println("Informe o consumo mensal em kWh");
        consumomensal = ler.nextDouble();
        switch (bandeira) {
            case 1:
                total = consumomensal * 0.5;
                System.out.println("O valor total da conta é: R$" + total);
                break;
            case 2:
                total = consumomensal * 0.5 * 1.1;
                System.out.println("O valor total da conta é: R$" + total);
                break;
            case 3:
                total = consumomensal * 0.5 * 1.25;
                System.out.println("O valor total da conta é: R$" + total);
                break;
            default:
                System.out.println("Bandeira tarifária inválida.");
                break;
        }


        
    }
    
}
