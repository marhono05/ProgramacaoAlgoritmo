import java.util.Scanner;

public class exercicio14 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int totaleleitores, brancos, nulos, validos;
        double porcbrancos, porcnulos, porcvalidos;

        System.out.println("Digite o número de eleitores");

        totaleleitores = ler.nextInt();

        System.out.println("Digite o número de votos brancos");

        brancos = ler.nextInt();

        System.out.println("Digite o número de votos nulos");

        nulos = ler.nextInt();

        System.out.println("Digite o valor de votos válidos");

        validos = ler.nextInt();

        porcbrancos = totaleleitores * (brancos / 100);

        porcnulos = totaleleitores * (nulos / 100);

        porcvalidos = totaleleitores * (validos / 100);

        System.out.println("O número de eleitores é " + totaleleitores + " o número de votos brancos é de " + porcbrancos);
        

        





        
    }
}
