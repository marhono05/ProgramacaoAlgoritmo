import java.util.Scanner;

public class exercicio19 {  //Faça um programa que peça ao usuário o valor total da conta de um restaurante, a taxa de serviço (em %) eo  número de pessoas na mesa. 
    //O programa deve calcular: o valor da taxa de serviço, o valor total da conta com a taxa, quanto cada deve pagar.
    // Exemplo: valor da conta 200, taxa de serviço 10%: 20,00, valor total 220, cada pessoa paga 55 

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double valorconta, porctaxa, pessoas, taxafinal, valortotal, precopessoa;

        System.out.println("Qual o valor da conta?"); 
        valorconta = ler.nextDouble();

        System.out.println("Qual a porcentagem da taxa de serviço?");
        porctaxa = ler.nextDouble();

        System.out.println("Quantas pessoas estão na mesa?");
        pessoas = ler.nextDouble();

        taxafinal = valorconta * (porctaxa/100);
        valortotal = valorconta + taxafinal;
        precopessoa = valortotal / pessoas;

        System.out.println("A conta foi de " + valorconta + "R$ mais " + taxafinal + "R$ de taxa, o valor total foi de " 
        + valortotal + "R$ e cada pessoa pagará " + precopessoa + "R$.");

   
    
    }
}