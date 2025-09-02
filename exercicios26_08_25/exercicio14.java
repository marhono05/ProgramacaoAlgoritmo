import java.util.Scanner;

public class exercicio14 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double porcbrancos, porcnulos, porcvalidos, totalvotos, brancos, nulos, validos;

        System.out.println("Digite o número de votos");

        totalvotos = ler.nextDouble();

        System.out.println("Digite o número de votos brancos");

        brancos = ler.nextDouble();

        System.out.println("Digite o número de votos nulos");

        nulos = ler.nextDouble();

        System.out.println("Digite o valor de votos válidos");

        validos = ler.nextDouble();

        porcbrancos = brancos/totalvotos * 100;

        porcnulos = nulos/totalvotos * 100;

        porcvalidos = validos/totalvotos * 100;

        System.out.println("Foram registrados " + totalvotos + " votos e " + porcbrancos + "% de votos brancos, " + porcnulos + "% de votos nulos, " + porcvalidos + "% de votos válidos.");

    
        

        





        
    }
}
