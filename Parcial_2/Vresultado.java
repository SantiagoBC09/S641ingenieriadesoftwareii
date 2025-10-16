package Parcial_2;

import Parcial_2.escojermdf.Resultado;
import java.util.*;

public class Vresultado {
    private Cliente cliente;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, int tarjeta) {
        this.cliente = cliente;
        this.numeroTarjetaCredito = tarjeta;
        this.fecha = new Date();
    }

    public void agregarProducto(ResultadoF resultado) {
        Resultado p = resultado.crearResultado();
        productos.add(p);
        System.out.println("\nProducto agregado al pedido de " + cliente.getNombre());
        p.mostrarDetalles();
    }

    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public void mostrarResumen() {
        System.out.println("\n📦 RESUMEN DEL PEDIDO DE " + cliente.getNombre());
        productos.forEach(Producto::mostrarDetalles);
        System.out.println("💰 TOTAL A PAGAR: $" + calcularTotal());
    }
}
