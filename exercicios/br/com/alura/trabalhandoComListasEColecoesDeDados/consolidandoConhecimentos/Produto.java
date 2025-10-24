package br.com.alura.trabalhandoComListasEColecoesDeDados.consolidandoConhecimentos;

public class Produto implements Comparable<Produto> {
    private String descricao;
    private double valor;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        String descricao = "%s - R$ %.2f".formatted(this.descricao, this.valor);
        return descricao;
    }


    @Override
    public int compareTo(Produto o) {
        if (this.getValor() >= o.getValor()) {
            return 1;
        } else if (o.getValor() >= this.getValor()) {
            return -1;
        } else {
            return 0;
        }
    }
}
