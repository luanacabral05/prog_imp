package conta_loja_pessoas_PA;

import java.util.Scanner;

public class ProgressaoAritmetica {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o valor inicial: ");
        int inicial = input.nextInt();

        System.out.print("Digite o fator de incremento: ");
        int incremento = input.nextInt();

        System.out.print("Digite a quantidade de termos: ");
        int termos = input.nextInt();

        for (int i = 0; i < termos; i++) {
            System.out.print(inicial + (i * incremento) + " ");
        }
    }
}