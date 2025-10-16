package main;

public abstract class Producto {
    protected int id;
    protected String nombre;
    protected double precio;

    public abstract double calcularPrecio();

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}
