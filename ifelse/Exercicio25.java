import java.util.Scanner;

public class Exercicio25 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double valortotal, pagamento, cartao, pix;

        System.out.println("Informe o valor total da compra");  
        valortotal = ler.nextDouble();

        System.out.println("Digite a forma de pagamento: 1 para cartão ou 2 para pix. ");
        pagamento = ler.nextDouble();

        cartao = (valortotal * 0.05) + valortotal;
        pix =  valortotal - (valortotal * 0.05);

        if (pagamento == 1) {
            System.out.println("O total da compra é R$" + cartao);
        } else {
            System.out.println("O total da compra é R$" + pix);
        }

      





    }
}
