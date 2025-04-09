import java.util.Scanner;

public class Exercicio7 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = input.nextInt();
        }
        int maior = vetor[0];
        int posicao = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }
        System.out.println("Vetor:");
        for (int num : vetor) System.out.print(num + " ");
        System.out.println("\nMaior: " + maior + " (posição " + posicao + ")");
    }
}