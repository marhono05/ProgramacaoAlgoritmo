import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$0.00");

        double largura, comprimento, altura, volumecaixa, valorfrete;

        System.out.println("Informe, em metros, a largura");
        largura = ler.nextDouble();

        System.out.println("Informe, em metros, o comprimento");
        comprimento = ler.nextDouble();

        System.out.println("Informe, em metros, a altura");
        altura = ler.nextDouble();

        System.out.println("Informe o valor do frete");
        valorfrete = ler.nextDouble();

        volumecaixa = largura * comprimento * altura;

        System.out.println("Largura: " + largura);
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Altura: " + altura);
        System.out.println("Volume da caixa: " + volumecaixa);
        System.out.println("Valor do frete: (" + df.format(valorfrete) + " por m³): " + df.format(valorfrete * volumecaixa));
        System.out.println("Seguro: " + df.format(0.02 * (valorfrete * volumecaixa)));
        System.out.println("Valor total: " + df.format((valorfrete * volumecaixa) + (0.02 * (valorfrete * volumecaixa))));



        




        
    }
}