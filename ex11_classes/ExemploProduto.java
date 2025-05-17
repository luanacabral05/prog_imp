package ex11_classes;

import java.util.Scanner;

public class ExemploProduto {
  public static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    Produto p1 = new Produto();
    Produto p2 = new Produto();

    System.out.println("-------DIGITAÇÃO PRODUTO 1-------");
    lerProduto(p1);

    System.out.println("-------DIGITAÇÃO PRODUTO 2-------");
    lerProduto(p2);

    System.out.println("-------IMPRESSÃO PRODUTOS-------");
    imprimirProduto(p1);
    imprimirProduto(p2);
  }

  public static void lerProduto(Produto p) {
    System.out.print("Digite o título: ");
    p.titulo = input.nextLine();

    System.out.print("Digite a descrição: ");
    p.descricao = input.nextLine();

    System.out.print("Digite o preço unitário: ");
    p.precoUnitario = input.nextDouble();

    System.out.print("Digite a quantidade em estoque: ");
    p.qtdEstoque = input.nextInt();
    input.nextLine(); // limpar o buffer
  }

  public static void imprimirProduto(Produto p) {
    System.out.printf("Título: %s\nDescrição: %s\nPreço Unitário: R$ %.2f\nQuantidade em Estoque: %d\n\n",
        p.titulo, p.descricao, p.precoUnitario, p.qtdEstoque);
  }
}