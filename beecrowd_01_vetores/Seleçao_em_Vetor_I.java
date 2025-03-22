import java.util.Scanner;

public class Seleçao_em_Vetor_I {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        double[] A = new double[100];
        
        for (int i = 0; i < 100; i++) {
            A[i] = input.nextDouble();
        }
        
        for (int i = 0; i < 100; i++) {
            if (A[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, A[i]);
            }
        }
    }
}
