package exercicios13_10_25;

import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double sexo, peso, altura, imc;

        System.out.println("Informe o sexo da pessoa, 1 para masculino e 2 para feminino.");
        sexo = ler.nextDouble();

        System.out.println("Informe o peso, em kg.");
        peso = ler.nextDouble();

        System.out.println("Informe a altura, em metros.");
        altura = ler.nextDouble();

        imc = peso / (altura * altura);

        if (sexo == 1) {
            if (imc > 25) {
                System.out.println("Seu IMC é " + imc + " Você está acima do peso!");              
            } else {
                System.out.println("Seu IMC é " + imc + " Você está no peso ideal!");
            }

        } else if (sexo == 2) {
            if (imc > 24) {
                System.out.println("Seu IMC é " + imc + " Você está acima do peso!");
            } else {
                System.out.println("Seu IMC é " + imc + " Você está no peso ideal!");
            }
        }

    }

}
