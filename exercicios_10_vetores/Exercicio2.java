import java.util.Scanner;

public class Exercicio2 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] vetor = new int[6];
        System.out.println("Digite 6 valores inteiros:");
        for (int i = 0; i < 6; i++) {
            vetor[i] = input.nextInt();
        }
        System.out.println("Valores lidos:");
        for (int num : vetor) {
            System.out.println(num);
        }
    }
}