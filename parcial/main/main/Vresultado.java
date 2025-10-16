package main;

public class Vresultado {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE FOTOGRAFÍA ===");

        // Crear cliente
        Cliente cliente = new Cliente("1023456789", "Juan Pérez", "Boda");

        // Crear productos (Camara e Impresion heredan de Producto)
        Camara camara = new Camara(1, "Canon", "EOS 90D");
        Impresion impresion = new Impresion(2, "A color", 10);

        // Crear arreglo de productos del pedido
        Producto[] productos = { camara, impresion };

        // Crear pedido
        Pedido pedido = new Pedido(cliente, productos, 12345678);

        // Mostrar la factura (pedido total)
        pedido.mostrarFactura();

        // Simulación de cálculo progresivo del precio
        System.out.print("\nCalculando precio total, espere un momento");
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(3000); // Espera 3 segundo
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mostrar total final
        System.out.println("\n Precio total: $" + pedido.calcularTotal());
        System.out.println("¡Gracias por su compra!");
    }
}
