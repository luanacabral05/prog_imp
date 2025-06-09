package controle_estoque;

import java.util.Scanner;

public class ControleEstoque {
    static Scanner input = new Scanner(System.in);
    static final int TAM = 50;

    public static void main(String[] args) {
        Produto[] produtos = new Produto[TAM];
        int qtd = 0;
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Listar todos");
            System.out.println("3. Filtrar por categoria");
            System.out.println("4. Ordenar por preço");
            System.out.println("5. Remover produto");
            System.out.println("6. Atualizar preço");
            System.out.println("7. Listar com subtotais por categoria");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1 -> qtd = cadastrarProduto(produtos, qtd);
                case 2 -> listar(produtos, qtd);
                case 3 -> filtrarPorCategoria(produtos, qtd);
                case 4 -> ordenarPorPreco(produtos, qtd);
                case 5 -> qtd = removerProduto(produtos, qtd);
                case 6 -> atualizarPreco(produtos, qtd);
                case 7 -> listarPorCategoriaComSubtotal(produtos, qtd);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    static int cadastrarProduto(Produto[] vet, int qtd) {
        if (qtd >= vet.length) {
            System.out.println("Limite de produtos atingido!");
            return qtd;
        }

        Produto p = new Produto();
        System.out.print("Nome/Descrição: ");
        p.nome = input.nextLine();
        System.out.print("Quantidade em estoque: ");
        p.qtdEstoque = input.nextInt();
        System.out.print("Preço unitário: ");
        p.precoUnitario = input.nextDouble();
        input.nextLine(); // Limpar buffer
        System.out.print("Categoria: ");
        p.categoria = input.nextLine();
        System.out.print("Quantidade mínima: ");
        p.qtdMinima = input.nextInt();
        input.nextLine();

        vet[qtd] = p;
        return qtd + 1;
    }

    static void listar(Produto[] vet, int qtd) {
        for (int i = 0; i < qtd; i++) {
            imprimir(vet[i]);
        }
    }

    static void imprimir(Produto p) {
        System.out.printf("Produto: %s | Categoria: %s\n", p.nome, p.categoria);
        System.out.printf("Descrição: %s\n", p.nome);
        System.out.printf("Preço: R$ %.2f | Estoque: %d | Mínima: %d\n", p.precoUnitario, p.qtdEstoque, p.qtdMinima);
        System.out.printf("Valor total em estoque: R$ %.2f\n\n", p.valorTotalEmEstoque());
    }

    static void filtrarPorCategoria(Produto[] vet, int qtd) {
        System.out.print("Digite a categoria para filtrar: ");
        String categoria = input.nextLine();

        for (int i = 0; i < qtd; i++) {
            if (vet[i].categoria.equalsIgnoreCase(categoria)) {
                imprimir(vet[i]);
            }
        }
    }

    static void ordenarPorPreco(Produto[] vet, int qtd) {
        for (int i = 1; i < qtd; i++) {
            Produto chave = vet[i];
            int j = i - 1;
            while (j >= 0 && vet[j].precoUnitario > chave.precoUnitario) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = chave;
        }
        System.out.println("Produtos ordenados por preço!");
    }

    static int removerProduto(Produto[] vet, int qtd) {
        System.out.print("Digite o nome do produto a ser removido: ");
        String nome = input.nextLine();
        int pos = -1;

        for (int i = 0; i < qtd; i++) {
            if (vet[i].nome.equalsIgnoreCase(nome)) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            for (int i = pos; i < qtd - 1; i++) {
                vet[i] = vet[i + 1];
            }
            vet[qtd - 1] = null;
            System.out.println("Produto removido.");
            return qtd - 1;
        } else {
            System.out.println("Produto não encontrado.");
            return qtd;
        }
    }

    static void atualizarPreco(Produto[] vet, int qtd) {
        System.out.print("Digite o nome do produto: ");
        String nome = input.nextLine();
        for (int i = 0; i < qtd; i++) {
            if (vet[i].nome.equalsIgnoreCase(nome)) {
                System.out.print("Novo preço: ");
                vet[i].precoUnitario = input.nextDouble();
                input.nextLine();
                System.out.println("Preço atualizado.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    static void listarPorCategoriaComSubtotal(Produto[] vet, int qtd) {
        double totalGeral = 0;
        for (int i = 0; i < qtd; i++) {
            String cat = vet[i].categoria;
            if (vet[i] == null || vet[i].categoria == null) continue;

            System.out.println("Categoria: " + cat);
            double subtotal = 0;
            for (int j = 0; j < qtd; j++) {
                if (vet[j].categoria.equals(cat)) {
                    imprimir(vet[j]);
                    subtotal += vet[j].valorTotalEmEstoque();
                }
            }
            System.out.printf("Subtotal da categoria \"%s\": R$ %.2f\n\n", cat, subtotal);
            totalGeral += subtotal;
        }
        System.out.printf("TOTAL GERAL: R$ %.2f\n", totalGeral);
    }
}