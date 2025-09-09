import java.text.DecimalFormat;
import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double prestacaofixa, valorfinanciamento, jurosmes, i, n, valorcima, valorbaixo, divisao;
        DecimalFormat df = new DecimalFormat("R$ #,###0.00");

        System.out.println("Qual o valor do financiamento?");
        valorfinanciamento = ler.nextDouble();

        System.out.println("Qual a taxa de juros ao mês?");
        jurosmes = ler.nextDouble(); 

        System.out.println("Qual a quantidade de meses para pagar?");
        n = ler.nextDouble();

        i = jurosmes /100;

        valorcima = Math.pow(1 + i, n) * i;
        valorbaixo = Math.pow(1 + i, n) - 1;
        divisao = valorcima / valorbaixo;
        prestacaofixa = valorfinanciamento * divisao;

        System.out.println("O valor da prestação fixa é de " + df.format(prestacaofixa));


    

        
        

       



        



        


        

        

        

      

   



     
      





       
    }
}