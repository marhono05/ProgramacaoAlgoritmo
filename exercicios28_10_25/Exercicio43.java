package exercicios28_10_25;

import java.util.Scanner;

public class Exercicio43 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int tipo;
        double distancia, total;

        System.out.println("Digite o tipo de transporte:");
        System.out.println("1 - Ônibus");
        System.out.println("2 - Trem");
        System.out.println("3 - Avião");
        tipo = ler.nextInt();
        System.out.println("Digite a distância em KM");
        distancia = ler.nextDouble();
        switch (tipo) {
            case 1:
                if (distancia <= 500){
                    total = distancia * 0.5;
                    System.out.println("O valor total da passagem é: R$" + total);
                }else{
                    total = distancia * 0.45;
                    System.out.println("O valor total da passagem é: R$" + total);
                }
                break;
            case 2:
                if (distancia <= 500){
                total = distancia * 0.4;
                System.out.println("O valor total da passagem é: R$" + total);
                }else{
                total = distancia * 0.35;
                System.out.println("O valor total da passagem é: R$" + total);
                }
                break;
            case 3:
                if (distancia <= 500){
                total = distancia * 0.1;
                System.out.println("O valor total da passagem é: R$" + total);
                }else{
                total = distancia * 0.8;
                System.out.println("O valor total da passagem é: R$" + total);
                }
                break;
            default: System.out.println("Opção inexistente.");
                break;
        }


        
    }

    
}