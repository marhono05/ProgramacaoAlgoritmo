package exercicios13_10_25;

import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double veiculo, distperco, taricarro, taricarro2, tarimoto, tarimoto2;

        System.out.println("Qual o seu veículo?");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        veiculo = ler.nextDouble();

        System.out.println("Insira a distância percorrida, em km.");
        distperco = ler.nextDouble();

        taricarro = distperco * 2.50;
        taricarro2 = distperco * 2;

        tarimoto = distperco * 1.50;
        tarimoto2 = distperco * 1.20;

    
        
    }
    
}
