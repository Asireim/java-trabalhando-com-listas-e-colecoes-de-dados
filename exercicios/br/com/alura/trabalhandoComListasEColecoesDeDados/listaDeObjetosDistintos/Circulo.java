package br.com.alura.trabalhandoComListasEColecoesDeDados.listaDeObjetosDistintos;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = (Math.PI * (this.raio * this.raio));
        return area;
    }
}
