package ExemploIfEnc;

import java.util.Scanner;

public class ExemploIfEnc {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double valorconta, valorfrete, valorfinal;

        System.out.println("Digite o valor da conta!");
        valorconta = ler.nextDouble();

        System.out.println("Digite o valor do frete!");
        valorfrete = ler.nextDouble();

        if (valorconta < 500) {
            valorfinal = valorconta + valorfrete;        
        } else if(valorconta < 1000){
            valorfinal = valorconta + (valorfrete * 0.8); // Desconto de 20%
        } else if(valorconta < 1500){
            valorfinal = valorconta + (valorfrete * 0.6); // Desconto de 40%
        } else if(valorconta < 2000){
            valorfinal = valorconta + (valorfrete * 0.5); // Desconto de 50%
        } else {
            valorfinal = valorconta;
        }
        System.out.println("O valor final da conta é de: R$" + valorfinal);
        
    }
    
}
