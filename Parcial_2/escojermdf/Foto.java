
class Foto {

    private Resultado resultado;

    public Foto(Resultado resultado) {
        this.resultado = resultado;
    }

    public double obtenerPrecioFinal() {
        return resultado.getTotal();
    }

    public void mostrarFactura() {
        System.out.println("🧾 FACTURA FINAL");
        resultado.mostrarResultado();
        System.out.println("Total a pagar (foto + impresión): $" + obtenerPrecioFinal());
    }
}

