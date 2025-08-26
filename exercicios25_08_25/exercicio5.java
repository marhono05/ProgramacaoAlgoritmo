import java.util.Scanner;

public class exercicio5 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int alunos, paes, recebeu, sobrou;

        System.out.println("Quantos alunos tem na sua turma?");

        alunos = ler.nextInt();

        System.out.println("Quantos pães foram comprados para a merenda?");

        paes = ler.nextInt();

        recebeu = 1;

        sobrou = paes - alunos;

        System.out.println("Cada aluno da sua turma receberá " + recebeu + " pão e irá sobrar " + sobrou + " pães.");

        

        
    


    }
}
