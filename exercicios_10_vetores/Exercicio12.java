import java.util.Scanner;

public class Exercicio12 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        double[] vetor = new double[5];
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = input.nextDouble();
        }
        double maior = vetor[0];
        double menor = vetor[0];
        double soma = 0;
        for (double num : vetor) {
            if (num > maior) maior = num;
            if (num < menor) menor = num;
            soma += num;
        }
        System.out.println("Valores: ");
        for (double num : vetor) System.out.print(num + " ");
        System.out.printf("\nMaior: %.2f\nMenor: %.2f\nMédia: %.2f", maior, menor, soma / 5);
    }
}