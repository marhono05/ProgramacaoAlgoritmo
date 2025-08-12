import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double base, altura, area;    //Sempre que houver divisão, utilizar o DOUBLE ao invés do INT, pois ele é capaz de receber números reais.

        System.out.println(" Digite o valor da base");
        base = ler.nextDouble();

        System.out.println(" Digite o valor da altura ");
        altura = ler.nextDouble();

        area = base * altura / 2;

        System.out.println(" A área do triângulo é " + area);

    







    }
    
}
