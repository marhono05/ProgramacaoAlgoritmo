import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double reais, dolar, comprar;

        System.out.println("Digite um valor em reais R$");

        reais = ler.nextDouble();

        System.out.println("Digite o valor do dólar");

        dolar = ler.nextDouble();

        comprar = reais / dolar;

        System.out.println("Você poderá comprar " + comprar + " dólares.");




        
    }
    
}
