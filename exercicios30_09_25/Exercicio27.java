import java.util.Scanner;

public class Exercicio27 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int velocidadecarro;

        System.out.println("Insira a velocidade do carro.");
        velocidadecarro = ler.nextInt();

        if (velocidadecarro > 100) {
            System.out.println(
            "O carro passou do limite permitido, por cada km acima de 100, será cobrado R$57, o valor final é de " +
            (velocidadecarro - 100) * 57);
        } else {
            System.out.println("Você não está acima do limite de velocidade, parabéns.");
        }

    }
}
