package conta_loja_pessoas_PA;

import java.util.Scanner;

public class AnaliseDados {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int idadeMaisPesada = 0;
        double pesoMaisPesada = 0;
        double somaPesoHomensMenos30 = 0;
        int countHomensMenos30 = 0;
        int countMulheresMenos50kg = 0;
        int totalMulheres = 0;

        while (true) {
            System.out.print("Digite o sexo (M/F) ou 'S' para sair: ");
            String sexo = input.next();
            if (sexo.equalsIgnoreCase("S")) break;

            System.out.print("Digite a idade: ");
            int idade = input.nextInt();

            System.out.print("Digite o peso: ");
            double peso = input.nextDouble();

            if (peso > pesoMaisPesada) {
                pesoMaisPesada = peso;
                idadeMaisPesada = idade;
            }

            if (sexo.equalsIgnoreCase("M") && idade < 30) {
                somaPesoHomensMenos30 += peso;
                countHomensMenos30++;
            }

            if (sexo.equalsIgnoreCase("F")) {
                totalMulheres++;
                if (peso < 50) countMulheresMenos50kg++;
            }
        }

        System.out.println("Idade da pessoa mais pesada: " + idadeMaisPesada);
        if (countHomensMenos30 > 0) {
            System.out.printf("Média de peso dos homens com menos de 30 anos: %.2f kg%n", somaPesoHomensMenos30 / countHomensMenos30);
        }
        if (totalMulheres > 0) {
            System.out.printf("Percentual de mulheres com menos de 50 kg: %.2f%%%n", (countMulheresMenos50kg * 100.0 / totalMulheres));
        }
    }
}