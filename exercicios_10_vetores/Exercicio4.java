import java.util.Scanner;

public class Exercicio4 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] vetor = new int[8];
        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            vetor[i] = input.nextInt();
        }
        System.out.println("Digite os índices X e Y (0 a 7):");
        int x = input.nextInt();
        int y = input.nextInt();
        if (x < 0 || x >= 8 || y < 0 || y >= 8) {
            System.out.println("Índices inválidos!");
            return;
        }
        int soma = vetor[x] + vetor[y];
        System.out.println("Soma: " + soma);
    }
}