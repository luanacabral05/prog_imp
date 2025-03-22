import java.util.Scanner;

public class Preenchimento_Vetor_II { 
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int T = input.nextInt();
        int[] N = new int[1000];
        
        for (int i = 0; i < 1000; i++) {
            N[i] = i % T;
        }
        
        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}
