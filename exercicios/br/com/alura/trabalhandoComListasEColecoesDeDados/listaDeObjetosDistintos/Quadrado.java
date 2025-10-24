package br.com.alura.trabalhandoComListasEColecoesDeDados.listaDeObjetosDistintos;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = (this.lado * this.lado);
        return area;
    }
}
