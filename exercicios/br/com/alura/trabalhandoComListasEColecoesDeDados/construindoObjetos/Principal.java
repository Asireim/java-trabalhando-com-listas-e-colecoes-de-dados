package br.com.alura.trabalhandoComListasEColecoesDeDados.construindoObjetos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Teclado", 199.90, 10));
        produtos.add(new Produto("Mouse", 149.90, 5));
        produtos.add(new Produto("Monitor", 1149.99, 8));

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("Segundo produto da lista: " + produtos.get(1));
        System.out.println(produtos);

        var carne = new ProdutoPerecivel("Carne", 49.90, 5, "23/11/2025");
        System.out.println(carne);
    }
}
