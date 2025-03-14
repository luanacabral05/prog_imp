import java.util.Random;

public class JogoDeDados {
    public static void main(String[] args) {
        Random random = new Random();
        int pontosJogador1 = 0;
        int pontosJogador2 = 0;

        for (int i = 1; i <= 10; i++) {
            int dadoJogador1 = random.nextInt(6) + 1;
            int dadoJogador2 = random.nextInt(6) + 1;

            System.out.print("Jogador 1: " + dadoJogador1 + " - Jogador 2: " + dadoJogador2 + " - ");

            if (dadoJogador1 > dadoJogador2) {
                System.out.println("Jogador 1 ganhou");
                pontosJogador1++;
            } else if (dadoJogador1 < dadoJogador2) {
                System.out.println("Jogador 2 ganhou");
                pontosJogador2++;
            } else {
                System.out.println("Empatou");
            }
        }

        System.out.println("\nResultado Final:");
        if (pontosJogador1 > pontosJogador2) {
            System.out.println("Jogador 1 ganhou por " + pontosJogador1 + "x" + pontosJogador2 + "!");
        } else if (pontosJogador1 < pontosJogador2) {
            System.out.println("Jogador 2 ganhou por " + pontosJogador2 + "x" + pontosJogador1 + "!");
        } else {
            System.out.println("O jogo empatou por " + pontosJogador1 + "x" + pontosJogador2 + "!");
        }
    }
}