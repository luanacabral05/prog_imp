import java.util.Scanner;

public class Exercicio8 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] vetor = new int[6];
        System.out.println("Digite 6 valores inteiros:");
        for (int i = 0; i < 6; i++) {
            vetor[i] = input.nextInt();
        }
        System.out.println("Valores na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}