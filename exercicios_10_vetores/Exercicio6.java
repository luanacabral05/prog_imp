import java.util.Scanner;

public class Exercicio6 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = input.nextInt();
        }
        int maior = vetor[0];
        int menor = vetor[0];
        for (int num : vetor) {
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
        System.out.println("Maior: " + maior + "\nMenor: " + menor);
    }
}