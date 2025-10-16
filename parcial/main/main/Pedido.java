package main;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = new Date();
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularPrecio();
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("=== FACTURA ===");
        System.out.println("\n  Cliente: " + cliente.getNombre() + "\n Numero de Tarjeta (no se mostrara por seguridad): " + "****");
        for (Producto p : productos) {
            System.out.println("- " + p.getClass().getSimpleName() + " $" + p.calcularPrecio());
        }
        
    }
}
