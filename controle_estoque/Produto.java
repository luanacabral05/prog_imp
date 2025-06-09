package controle_estoque;

public class Produto {
    String nome;
    String descricao;
    double precoUnitario;
    int qtdEstoque;
    String categoria;
    int qtdMinima;

    public double valorTotalEmEstoque() {
        return precoUnitario * qtdEstoque;
    }
}