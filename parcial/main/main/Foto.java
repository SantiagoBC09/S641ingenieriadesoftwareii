package main;


class Foto {

    private Pedido resultado;

    public Foto(Pedido resultado) {
        this.resultado = resultado;
    }

    public double obtenerPrecioFinal() {
        return resultado.calcularTotal();
    }

    public void mostrarFactura() {
        System.out.println("FACTURA FINAL");
        resultado.calcularTotal();
        System.out.println("Total a pagar (foto + impresión): $" + obtenerPrecioFinal());
    }
}

