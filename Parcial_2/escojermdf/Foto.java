package main.model.producto;

public class Foto {
    private String fichero;
    private double precio;

    public Foto(String fichero, double precio) {
        this.fichero = fichero;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void print() {
        System.out.println("Imprimiendo foto: " + fichero + " (Precio: $" + precio + ")");
    }
}
