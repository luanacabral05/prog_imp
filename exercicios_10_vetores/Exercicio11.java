import java.util.Scanner;

public class Exercicio11 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        double[] vetor = new double[10];
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = input.nextDouble();
        }
        int negativos = 0;
        double somaPositivos = 0;
        for (double num : vetor) {
            if (num < 0) negativos++;
            else if (num > 0) somaPositivos += num;
        }
        System.out.println("Negativos: " + negativos + "\nSoma dos positivos: " + somaPositivos);
    }
}