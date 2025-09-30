import java.util.Scanner;

public class Exercicio28 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int horastrabalhadas;
        double valorhoranormal;

        System.out.println("Insira o valor da sua hora.");
        valorhoranormal = ler.nextDouble();

        System.out.println("Insira as horas trabalhadas.");
        horastrabalhadas = ler.nextInt();

        if (horastrabalhadas > 10) {
            System.out.println("A porcentagem da sua hora extra é 50% a mais, você receberá: R$" + 
            (valorhoranormal * 0.5 + valorhoranormal) * horastrabalhadas);       
        } else { 
            System.out.println("A porcentagem da sua hora extra é 25% a mais, você receberá: R$" + 
            (valorhoranormal * 0.25 + valorhoranormal) * horastrabalhadas);
        }
    }
}
