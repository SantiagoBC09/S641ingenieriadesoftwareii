package main;

public class Impresion extends Producto {
    private String tipo; // "Color" o "Blanco y negro"
    private int cantidad;

    public Impresion(int id, String tipo, int cantidad) {
        this.id = id;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.nombre = "Impresión " + tipo;
        this.precio = calcularPrecio();
    }

    @Override
    public double calcularPrecio() {
        double precioUnitario = tipo.equalsIgnoreCase("color") ? 2000 : 1000;
        return cantidad * precioUnitario;
    }
}

