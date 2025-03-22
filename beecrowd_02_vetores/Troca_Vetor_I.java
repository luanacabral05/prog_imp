package beecrowd_02_vetores;

import java.util.Scanner;

public class Troca_Vetor_I { 
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] N = new int[20];

        for (int i = 0; i < 20; i++) {
            N[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int temp = N[i];
            N[i] = N[19 - i];
            N[19 - i] = temp;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}
