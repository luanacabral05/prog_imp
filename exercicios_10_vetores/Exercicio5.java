import java.util.Scanner;

public class Exercicio5 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = input.nextInt();
        }
        int pares = 0;
        for (int num : vetor) {
            if (num % 2 == 0) pares++;
        }
        System.out.println("Quantidade de pares: " + pares);
    }
}