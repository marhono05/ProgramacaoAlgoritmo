import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Informe o seu peso");

        peso = ler.nextDouble();

        System.out.println("Informe sua altura");

        altura = ler.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é " + imc);
        


        
    }
    
}
