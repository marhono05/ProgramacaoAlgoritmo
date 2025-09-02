import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double consukwh, valorkwh, valorconta, taxailuminacao, valorfinal;
        

        System.out.println("Informe a quantidade de kWh consumidos");

        consukwh = ler.nextDouble();

        System.out.println("Informe o valor do kWh");

        valorkwh = ler.nextDouble();

        valorconta = consukwh * valorkwh;

        taxailuminacao = valorconta * 0.05;

        valorfinal = valorconta + taxailuminacao;

        System.out.println("O valor total da conta é de " + valorconta + "R$ mais " + taxailuminacao + 
        "R$ da taxa de iluminação pública, o valor final da conta é de " + valorfinal + "R$.");
    }
    
}
