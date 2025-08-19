import java.util.Scanner;

public class exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int distancia, consumo, litros;

        System.out.println("Qual a distância, em quilômetros, da sua viagem?");
        
        distancia = ler.nextInt();

        System.out.println("Quantos km o seu carro faz com um litro?");

        litros = ler.nextInt();

        consumo = distancia / litros;

        System.out.println(" Para percorrer " + distancia + "km você precisará de " + consumo + " litros de combustível");


    }
}
