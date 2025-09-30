import java.util.Scanner;

public class Exercicio26 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double valordep, valorfinal;

        System.out.println("Digite o valor do depósito.");
        valordep = ler.nextDouble();

        if (valordep >= 1000) {
            System.out.println("Seu valor renderá 3%, o valor final é: R$" + (valordep * 0.03 + valordep));
        } else { 
            System.out.println("Seu valor vai render apenas 1,5%, o valor final é de: R$" + (valordep * 0.015 + valordep));
        }

        
    }
}
