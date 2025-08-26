import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("Qual a temperatura em graus Celsius?");

        celsius = ler.nextDouble();

        fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("A atual temperatura em Fahrenheit é " + fahrenheit + " graus.");
        
        
        
    }
}
