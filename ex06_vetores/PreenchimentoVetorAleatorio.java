package ex06_vetores;

import java.util.Random;
import java.util.Scanner;

public class PreenchimentoVetorAleatorio {
    public static Scanner input = new Scanner(System.in);
    public static Random geradorAleat = new Random(5);

    public static void main(String[] args) {
        int[] vetorAleatorio = new int[1000];
        int[] vetorEmbaralhado = new int[1000];

        preencherVetorAleatorioSemRepeticao(vetorAleatorio);
        preencherVetorEmbaralhado(vetorEmbaralhado);

        System.out.println("Vetor gerado com números aleatórios sem repetição:");
        imprimirVetor(vetorAleatorio);

        System.out.println("\nVetor gerado com preenchimento ordenado e embaralhado:");
        imprimirVetor(vetorEmbaralhado);
    }

    public static void preencherVetorAleatorioSemRepeticao(int[] v) {
        for (int i = 0; i < v.length; i++) {
            int numero;
            do {
                numero = geradorAleat.nextInt(1000) + 1;
            } while (busca(v, i, numero) != -1);
            v[i] = numero;
        }
    }

    public static int busca(int[] v, int tam, int x) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void preencherVetorEmbaralhado(int[] v) {
        // Preenche ordenado (1 a 1000)
        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;
        }

        // Embaralha usando o mesmo geradorAleat
        for (int i = 0; i < v.length; i++) {
            int indiceAleatorio = geradorAleat.nextInt(v.length);
            int temp = v[i];
            v[i] = v[indiceAleatorio];
            v[indiceAleatorio] = temp;
        }
    }

    public static void imprimirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}