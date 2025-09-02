import java.util.Scanner;

public class exercicio18 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double nota1, nota2, nota3, somamedia, mediafinal, peso1, peso2, peso3;

        peso1 = 2;

        peso2 = 3;

        peso3 = 5;
        

        System.out.println("Insira a primeira nota");

        nota1 = ler.nextDouble();

        System.out.println("Insira a segunda nota");

        nota2 = ler.nextDouble();

        System.out.println("Insira a terceira nota");

        nota3 = ler.nextDouble();

        somamedia = (nota1*peso1) + (nota2*peso2) + (nota3*peso3);

        mediafinal = somamedia/10;
        

        // Para calcular média ponderada, multiplica-se cada valor pelo seu peso, soma-se esses resultados e divida pela soma total dos pesos. 

        System.out.println("Sua média ponderada é " + mediafinal);

        
    }
    
}
