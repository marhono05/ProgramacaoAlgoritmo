import java.util.Scanner;

public class Revisao {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);

        double valorconta, porcgarcom, pessoas, valortotal;

        System.out.println("Insira o valor da conta");
        valorconta = ler.nextDouble();

        System.out.println("Digite a porcentagem do garçom");
        porcgarcom = ler.nextDouble()/ 100  * valorconta;

        System.out.println("Digite o número de pessoas");
        pessoas = ler.nextDouble();  

        valortotal = valorconta + porcgarcom;

        System.out.println("O valor total da conta é " + valortotal + " e o valor que cada pessoa pagará é de " + valortotal / pessoas);





        

        


    }

    
}