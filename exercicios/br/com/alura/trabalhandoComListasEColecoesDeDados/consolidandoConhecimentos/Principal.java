package br.com.alura.trabalhandoComListasEColecoesDeDados.consolidandoConhecimentos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 1;
        List<Produto> produtos = new ArrayList<>();

        String menu = """
                *******************
                COMPRAS REALIZADAS:

                %s
                *******************
                Saldo no cartão: R$ %.2f
                """;

        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        leitura.nextLine();

        while (opcao >= 1) {
            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.nextLine();

            System.out.println("Digite o valor da compra: ");
            double valor = leitura.nextDouble();
            leitura.nextLine();

            if (limite >= valor) {
                limite -= valor;
                produtos.add(new Produto(descricao, valor));
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                int selecao = leitura.nextInt();
                leitura.nextLine();

                if (selecao == 1) {
                    opcao = selecao;
                } else if (selecao == 0) {
                    Collections.sort(produtos);
                    System.out.printf(menu, produtos, limite);
                    opcao = 0;
                }
            } else {
                System.out.println("Saldo insuficiente!");
                Collections.sort(produtos);
                System.out.printf(menu, produtos, limite);
                opcao = 0;
            }
        }
    }
}
