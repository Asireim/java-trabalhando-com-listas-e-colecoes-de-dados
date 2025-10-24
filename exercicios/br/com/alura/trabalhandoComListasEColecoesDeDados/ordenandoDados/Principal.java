package br.com.alura.trabalhandoComListasEColecoesDeDados.ordenandoDados;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        //Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(9);
        numeros.add(8);
        numeros.add(10);

        Collections.sort(numeros);
        System.out.println(numeros);

        // Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.
        // No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
        List<Titulo> titulos = new ArrayList<>();

        titulos.add(new Titulo("House of Dragon"));
        titulos.add(new Titulo("Breaking Bad"));
        titulos.add(new Titulo("Squid Game"));
        Collections.sort(titulos);
        System.out.println(titulos);

        // Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
        List<String> listaArray = new ArrayList<>();

        listaArray.add("Teste1");
        listaArray.add("Teste2");

        List<String> listaLinked = new LinkedList<>();

        listaLinked.add("Teste3");
        listaLinked.add("Teste4");

        System.out.println("Array: " + listaArray);
        System.out.println("Linked: " + listaLinked);

        // Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
