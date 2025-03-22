package beecrowd_02_vetores;

import java.util.Scanner;

public class Preenchimento_de_Vetor_IV {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] par = new int[5];
        int[] impar = new int[5];
        int parIndex = 0, imparIndex = 0;

        for (int i = 0; i < 15; i++) {
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                par[parIndex] = num;
                parIndex++;
                if (parIndex == 5) {
                    imprimirVetor(par, "par");
                    parIndex = 0;
                }
            } else {
                impar[imparIndex] = num;
                imparIndex++;
                if (imparIndex == 5) {
                    imprimirVetor(impar, "impar");
                    imparIndex = 0;
                }
            }
        }

        imprimirVetor(impar, "impar", imparIndex);
        imprimirVetor(par, "par", parIndex);
    }

    static void imprimirVetor(int[] vetor, String nome) {
        for (int i = 0; i < 5; i++) {
            System.out.println(nome + "[" + i + "] = " + vetor[i]);
        }
    }

    static void imprimirVetor(int[] vetor, String nome, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(nome + "[" + i + "] = " + vetor[i]);
        }
    }
}