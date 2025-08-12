import java.util.Scanner;

public class Quadrado {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int lado1, area;

        System.out.println(" Digite o lado do quadrado ");
        lado1 = ler.nextInt();

        area = lado1 * lado1;

        System.out.println(" A área do quadrado é " + area);


    }
    
}
