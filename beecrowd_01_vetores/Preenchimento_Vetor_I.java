import java.util.Scanner;

public class Preenchimento_Vetor_I { 
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int V = input.nextInt();
        int[] N = new int[10];
        
        N[0] = V;
        
        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}