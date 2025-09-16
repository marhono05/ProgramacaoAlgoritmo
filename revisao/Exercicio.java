import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$0.00");

        double valorprodu, porcdesconto;

        System.out.println("Informe o valor do produto");
        valorprodu = ler.nextDouble();

        System.out.println("Insira a porcentagem do desconto");
        porcdesconto = ler.nextDouble() / 100 * valorprodu;

        System.out.println("O valor do desconto é de " + df.format(porcdesconto) + " e o valor do produto é de " + df.format(valorprodu - porcdesconto));
        

        


        
    }
    
}
