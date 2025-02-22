package ex03_condicionais;

import java.util.Scanner;

public class Exemplo03 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.print("Digite um número inteiro: ");
        num = input.nextInt();
        if (num < 0)  {
            System.out.print("O número " + num + " é negativo!");
        } else if (num == 0) {
            System.out.println("O número " + num + " é neutro!");
        } else {
            System.out.print("O número " + num + " é positivo!");
        }
    }
}
