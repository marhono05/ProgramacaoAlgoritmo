package EstruturaRep;

import java.util.Scanner;

public class ExercicioFor {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

       int n,n2;
       System.out.println("Digite um número de 1 á 10.");
       n = ler.nextInt();
       System.out.println("Abaixo está a tabuada do número " + n);
       for(n2=0; n2<=10; n2++) { System.out.println(n + " x " + n2 + " = " + n * n2);}

    }
}
       
            
    
        

        
    

