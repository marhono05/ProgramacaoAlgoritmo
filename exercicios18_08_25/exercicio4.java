import java.util.Scanner;

public class exercicio4 {
 
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double saldoinicial, saque, saldofinal;

        System.out.println("Quanto de dinheiro você tem no banco?");
        saldoinicial = ler.nextDouble();

        System.out.println("Quanto de dinheiro você deseja sacar?");
        saque = ler.nextDouble();

        saldofinal = saldoinicial - saque; 

        System.out.println("Você tinha " + saldoinicial + " sacou " + saque + " e ficou com " + saldofinal);

    }
}
