package vetor_ordenação;

import java.util.Scanner;

public class VetorOrdenacao {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o tamanho do vetor: ");
        int n = input.nextInt();
        int[] vetor = new int[n];
        
        preencherVetor(vetor, n);
        System.out.print("Vetor original: ");
        imprimirVetor(vetor, n);
        
        ordenar(vetor, n);
        System.out.print("Vetor ordenado: ");
        imprimirVetor(vetor, n);
        
        imprimirMaiorImpar(vetor, n);
        
        int[] pares = new int[n];
        int[] impares = new int[n];
        criarParesImpares(vetor, n, pares, impares);
        
        System.out.print("Pares: ");
        imprimirVetor(pares, pares.length);
        System.out.print("Ímpares: ");
        imprimirVetor(impares, impares.length);
    }

    public static void preencherVetor(int[] v, int n) {
        System.out.println("Digite " + n + " valores inteiros:");
        for (int i = 0; i < n; i++) {
            v[i] = input.nextInt();
        }
    }

    public static void imprimirVetor(int[] v, int n) {
        System.out.print("{ ");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static void ordenar(int[] v, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirMaiorImpar(int[] v, int n) {
        int maiorImpar = -1;
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 != 0 && v[i] > maiorImpar) {
                maiorImpar = v[i];
            }
        }
        if (maiorImpar == -1) {
            System.out.println("Não há números ímpares no vetor");
        } else {
            System.out.println("Maior ímpar: " + maiorImpar);
        }
    }

    public static void criarParesImpares(int[] v, int n, int[] pares, int[] impares) {
        int paresIndex = 0;
        int imparesIndex = 0;
        
        for (int i = 0; i < n; i++) {
            int num = v[i];
            if (num % 2 == 0) {
                if (paresIndex < pares.length) {
                    pares[paresIndex++] = num;
                }
            } else {
                if (imparesIndex < impares.length) {
                    impares[imparesIndex++] = num;
                }
            }
        }
        
        while (paresIndex < pares.length) {
            pares[paresIndex++] = -1;
        }
        while (imparesIndex < impares.length) {
            impares[imparesIndex++] = -1;
        }
    }
}