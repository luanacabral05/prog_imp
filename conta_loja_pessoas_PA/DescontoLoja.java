package conta_loja_pessoas_PA;

import java.util.Scanner;

public class DescontoLoja {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite a categoria do produto (1, 2 ou 3): ");
        int categoria = input.nextInt();

        System.out.print("Digite o preço do produto: ");
        double preco = input.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = input.nextInt();

        double descontoCategoria = 0;
        switch (categoria) {
            case 1: descontoCategoria = 0.10; break;
            case 2: descontoCategoria = 0.15; break;
            case 3: descontoCategoria = 0.08; break;
            default: System.out.println("Categoria inválida."); return;
        }

        double descontoQuantidade = 0;
        if (quantidade <= 2) {
            descontoQuantidade = 0.02;
        } else if (quantidade <= 10) {
            descontoQuantidade = 0.05;
        } else {
            descontoQuantidade = 0.10;
        }

        double precoComDesconto = preco * (1 - descontoCategoria) * (1 - descontoQuantidade);
        double totalCompra = precoComDesconto * quantidade;
        double economia = (preco * quantidade) - totalCompra;

        System.out.printf("Novo preço do produto: R$ %.2f%n", precoComDesconto);
        System.out.printf("Valor total da compra: R$ %.2f%n", totalCompra);
        System.out.printf("Economia: R$ %.2f%n", economia);
    }
}