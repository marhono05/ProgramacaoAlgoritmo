import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double valorconta, porcgorjeta, valorgorjeta, total;

        System.out.println("Digite o valor da conta");

        valorconta = ler.nextDouble();

        System.out.println("Digite a porcentagem da gorjeta");

        porcgorjeta = ler.nextDouble();

        valorgorjeta = valorconta * (porcgorjeta / 100);

        total = valorconta + valorgorjeta;

        System.out.println("A conta foi de R$ " + valorconta + ". A gorejta foi de R$ " + valorgorjeta + ". O valor total é de R$ " + total);

    

    }
    
}
