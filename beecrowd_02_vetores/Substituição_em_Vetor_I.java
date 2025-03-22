package beecrowd_02_vetores;

import java.util.Scanner;

public class Substituição_em_Vetor_I {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] X = new int[10];

        for (int i = 0; i < 10; i++) {
            X[i] = scanner.nextInt();
            if (X[i] <= 0) {
                X[i] = 1;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }
    }
}
