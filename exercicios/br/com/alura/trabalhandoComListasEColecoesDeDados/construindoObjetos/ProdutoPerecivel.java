package br.com.alura.trabalhandoComListasEColecoesDeDados.construindoObjetos;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String toString() {
        String info = """
                Nome do produto: %s
                Preço do produto: R$ %.2f
                Quantidade: %d
                Data de validade: %s
                """.formatted(super.nome, super.preco, super.quantidade, this.dataValidade);
        return info;
    }
}
