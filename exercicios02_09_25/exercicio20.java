import java.util.Scanner;

public class exercicio20 {

    public static void main(String[] args) { //Faça um programa que peça ao usuário o valor de um empréstimo, a taxa de juros ao mês(%) e a quantidade de meses.
        // O programa deve calcular:O valor total de juros, o valor total a pagar (empréstimo + juros).Fórmula: juros = (valor x taxa x meses) / 100
        // Exemplo : valor do empréstimo: 1000, juros totais: 150, valor total a pagar: 1150   meses 1 juros 15
        
        Scanner ler = new Scanner(System.in);

        double valoremprestimo, taxajuros, meses, valortotaljuros, valortotal;

        System.out.println("Qual o valor do empréstimo");
        valoremprestimo = ler.nextDouble();

        System.out.println("Qual a taxa de juros?");
        taxajuros = ler.nextDouble();

        System.out.println("Qual a quantidade de meses?");
        meses = ler.nextDouble();

        valortotaljuros = valoremprestimo * (taxajuros/100) * meses;
        valortotal = valoremprestimo + valortotaljuros;

        System.out.println("O valor total é de " + valoremprestimo + "R$ mais " + valortotaljuros + "R$ de juros, você vai pagar no total " + valortotal + "R$." );




        
    }
    
}
