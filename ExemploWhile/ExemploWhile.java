package ExemploWhile;

public class ExemploWhile { // Quando a condição definida for falsa, o While vai parar de repetir

    public static void main(String[] args) {
        
        int x = 0;
        while(x <= 9){
            System.out.println("Marcelo");
            x++;           
        }

        int y = 0;
        do{  // Usar o DO para executar pelo menos uma vez
            System.out.println("Marcelo");
            y++;           
        }while(y <=9);
    }

    
}
