package ex03_condicionais;

import java.util.Scanner;

public class Calculo_IMC {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Digite o seu peso em kg: ");
        double peso = input.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade Classe I");
        } else if (imc < 39.9) {
            System.out.println("Obesidade Classe II");
        } else {
            System.out.println("Obesidade Classe III");
        }
    }
}