import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double valor, horas;

        System.out.println("Digite um valor em minutos para converter");

        valor = ler.nextDouble();

        horas = valor / 60;
        
        System.out.println("São " + horas + " horas.");

    



    }
    
}
