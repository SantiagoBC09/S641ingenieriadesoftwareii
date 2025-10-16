package main;

public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private int idPedido;
    public Object mostrarFactura;

    public Pedido(Cliente cliente, Producto[] productos, int idPedido) {
        this.cliente = cliente;
        this.productos = productos;
        this.idPedido = idPedido;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("\n=== FACTURA ===");
        System.out.println("Cliente: " + cliente.getNombre());
        for (Producto p : productos) {
            System.out.println("- " + p);
        }
        System.out.println("Total: $" + calcularTotal());
    }

    
}

