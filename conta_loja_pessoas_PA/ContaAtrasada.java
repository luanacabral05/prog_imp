package conta_loja_pessoas_PA;

import java.util.Scanner;

public class ContaAtrasada {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o valor da conta: ");
        double valorConta = input.nextDouble();

        System.out.print("Digite o valor da multa (%): ");
        double multa = input.nextDouble();

        System.out.print("Digite o valor dos juros mensais (%): ");
        double juros = input.nextDouble();

        System.out.print("Digite a quantidade de dias em atraso: ");
        int diasAtraso = input.nextInt();

        if (diasAtraso < 45) {
            double valorMulta = valorConta * (multa / 100);
            double valorJuros = valorConta * (juros / 100) * (diasAtraso / 30.0);
            double valorTotal = valorConta + valorMulta + valorJuros;

            System.out.printf("Valor total da conta: R$ %.2f%n", valorTotal);
        } else {
            System.out.println("A conta não pode estar com mais de 45 dias de atraso.");
        }
    }
}