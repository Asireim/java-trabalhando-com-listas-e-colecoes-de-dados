package br.com.alura.trabalhandoComListasEColecoesDeDados.ColecaoDeFilmes;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa("Fulano", 35));
        listaDePessoas.add(new Pessoa("Ciclano", 40));
        listaDePessoas.add(new Pessoa("Beltrano", 43));

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.getFirst());
        System.out.println("Lista completa: " + listaDePessoas);
    }
}
