package main;

public class Impresion extends Producto {

    private String color;
    private int cantidad;

    public Impresion(int numero, String color, int cantidad) {
        super(numero);
        this.color = color;
        this.cantidad = cantidad;
    }

    @Override
    public double calcularPrecio() {
        double base = color.equalsIgnoreCase("a color") ? 2000 : 1500;
        return base * cantidad;
    }
}
