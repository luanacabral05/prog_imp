package ex06_vetores;

import java.util.Random;

public class TabelaFrequencia {
    public static Random geradorAleat = new Random(5);

    public static void main(String[] args) {
        int[] vetor = new int[200];
        preencherVetor(vetor);

        System.out.println("=== Método 1 (Contador Único) ===");
        imprimirFrequenciaMetodo1(vetor);

        System.out.println("\n=== Método 2 (Vetor de Contadores) ===");
        imprimirFrequenciaMetodo2(vetor);
    }

    public static void preencherVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = geradorAleat.nextInt(20) + 1;
        }
    }

    public static void imprimirFrequenciaMetodo1(int[] v) {
        System.out.println("Valor | Frequência");
        for (int valor = 1; valor <= 20; valor++) {
            int contador = 0;
            for (int num : v) {
                if (num == valor) {
                    contador++;
                }
            }
            System.out.printf("%5d | %d\n", valor, contador);
        }
    }

    // Método 2: Usa um vetor de contadores
    public static void imprimirFrequenciaMetodo2(int[] v) {
        int[] contadores = new int[21];
        for (int num : v) {
            contadores[num]++;
        }

        System.out.println("Valor | Frequência");
        for (int valor = 1; valor <= 20; valor++) {
            System.out.printf("%5d | %d\n", valor, contadores[valor]);
        }
    }
}