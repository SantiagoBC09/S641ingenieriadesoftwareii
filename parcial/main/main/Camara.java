package main;

public class Camara extends Producto {
    private String marca;
    private String modelo;
    private int calidad; // de 1 a 3

    public Camara(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.nombre = "Cámara " + marca + " " + modelo;
        this.precio = calcularPrecio();
    }

    @Override
    public double calcularPrecio() {
        // Precios base según calidad
        int calidad = (int) (Math.random() * 3) + 1; // simula calidad aleatoria
        double base = 15000;
        return base * calidad;
    }
}
