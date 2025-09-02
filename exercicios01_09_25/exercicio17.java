import java.util.Scanner;

public class exercicio17 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double precoproduto, icms, ipi, precofinal;

        System.out.println("Insira o valor do produto");

        precoproduto = ler.nextDouble();

        icms = precoproduto * 0.18;

        ipi = precoproduto * 0.04;

        precofinal = precoproduto + icms + ipi;

        System.out.println("O preço do produto é de "
         + precoproduto + "R$ mais " + icms + "R$ de ICMS, mais " + ipi + "R$ de IPI, o valor total é de " + precofinal + "R$.");

         

        
        
    }
    
}
