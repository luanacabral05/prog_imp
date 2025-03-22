package beecrowd_02_vetores;

import java.util.Scanner;

public class Fibonacci_Vetor { 
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int T = scanner.nextInt();
        long[] fibonacci = new long[61];

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i <= 60; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            System.out.println("Fib(" + N + ") = " + fibonacci[N]);
        }
    }
}
