import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double comprou, preco, total;

        System.out.println("Olá, quantos chocolates você comprou?");
        
        comprou = ler.nextDouble();

        System.out.println("Qual o valor de cada chocolate?");
        
        preco = ler.nextDouble();
        
        total = comprou * preco;

        System.out.println("Você comprou " + comprou + " chocolates. O valor total é  R$ " + total);


    
    }
}
