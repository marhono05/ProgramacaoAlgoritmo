import java.util.Scanner;

public class exercicio11 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double produto, desconto, valordesconto, precofinal;

        System.out.println("Digite o valor do produto");

        produto = ler.nextDouble();

        System.out.println("Digite a porcentagem do desconto");

        desconto = ler.nextDouble();

        valordesconto = produto * (desconto / 100);

        precofinal = produto - valordesconto;

        System.out.println("O produto custa R$ " + produto + ". O desconto foi de " + desconto + ". O preco final é de R$ " + precofinal);



        

        
    }
}
