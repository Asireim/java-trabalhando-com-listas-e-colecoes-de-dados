package br.com.alura.trabalhandoComListasEColecoesDeDados.construindoObjetos;

public class Produto {
    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        String info = """
                Nome do produto: %s
                Preço do produto: R$ %.2f
                Quantidade: %d
                """.formatted(this.nome, this.preco, this.quantidade);
        return info;
    }
}
