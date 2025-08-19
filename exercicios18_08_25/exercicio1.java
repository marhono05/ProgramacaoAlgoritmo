import java.util.Scanner;

public class exercicio1 {
 
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int idade, idadefinal;

        System.out.println("Qual é o seu nome?");
        
        nome = ler.next();

        System.out.println("Qual é a sua idade?");

        idade = ler.nextInt();

        idadefinal = idade + 10;

        System.out.println(nome + " daqui a 10 anos você terá " + idadefinal);

        

        



    }
 }