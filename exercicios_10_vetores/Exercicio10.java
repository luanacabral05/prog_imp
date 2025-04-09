import java.util.Scanner;

public class Exercicio10 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        double[] notas = new double[15];
        System.out.println("Digite as 15 notas:");
        for (int i = 0; i < 15; i++) {
            notas[i] = input.nextDouble();
        }
        double soma = 0;
        for (double nota : notas) soma += nota;
        System.out.printf("Média geral: %.2f\n", soma / 15);
    }
}