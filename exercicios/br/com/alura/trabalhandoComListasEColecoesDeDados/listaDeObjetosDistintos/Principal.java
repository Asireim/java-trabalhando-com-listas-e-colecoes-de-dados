package br.com.alura.trabalhandoComListasEColecoesDeDados.listaDeObjetosDistintos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Teste1");
        lista.add("Teste2");
        lista.add("Teste3");

        for(String palavra : lista) {
            System.out.println(palavra);
        }

        // Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
        // Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.
        Cachorro cachorro = new Cachorro();

        if (cachorro instanceof Animal animal) {
            animal = (Animal) cachorro;
        }

        // Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Teclado", 149.99));
        produtos.add(new Produto("Mouse", 79.99));
        produtos.add(new Produto("Monitor", 1199.90));

        double precos = 0;

        for(Produto produto : produtos) {
            precos += produto.getPreco();
        }

        double media = (precos / produtos.size());
        System.out.printf("Preço médio dos produtos: R$ %.2f%n", media);

        // Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(4.5));
        formas.add(new Circulo(4.0));
        formas.add(new Quadrado(2.0));
        formas.add(new Quadrado(2.5));

        for(Forma forma : formas) {
            if (forma instanceof Quadrado) {
                System.out.println("Área do quadrado: " + forma.calcularArea());
            } else if (forma instanceof Circulo) {
                System.out.println("Área do círculo: " + forma.calcularArea());
            }
        }

        //Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        contas.add(new ContaBancaria("142536", 150.00));
        contas.add(new ContaBancaria("748569", 450.00));
        contas.add(new ContaBancaria("147258", 850.00));
        contas.add(new ContaBancaria("951357", 265.00));

        ContaBancaria contaMaior = contas.getFirst();
        for(ContaBancaria conta : contas) {
            if (conta.getSaldo() > contaMaior.getSaldo()) {
                contaMaior = conta;
            }
        }

        System.out.printf("A conta %s possui o maior saldo, que é: %.2f", contaMaior.getNumeroConta(), contaMaior.getSaldo());
    }
}
