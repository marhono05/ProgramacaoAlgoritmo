import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double salariobruto, bonus, percinss, valorbonus, valordesconto, salariofinal;

        System.out.println("Informe o seu salário");

        salariobruto = ler.nextDouble();

        System.out.println("Informe o percentual do bônus");

        bonus = ler.nextDouble();

        System.out.println("Informe o percentual de desconto do INSS");

        percinss = ler.nextDouble();

        valorbonus = salariobruto * (bonus/100);
        
        valordesconto = salariobruto * (percinss/100);

        salariofinal = salariobruto + valorbonus - valordesconto;

        System.out.println("Seu salário é de " + salariobruto + "R$ e você recebeu " + valorbonus + 
        "R$ de bônus e " + valordesconto + "R$ de desconto, seu salário final é de " + salariofinal +"R$.");



    }
}