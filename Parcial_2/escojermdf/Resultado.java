// Clase Resultado
class Resultado {

    private Camara camara;
    private Impresion impresion;

    public Resultado(Camara camara, Impresion impresion) {
        this.camara = camara;
        this.impresion = impresion;
    }

    public void mostrarResultado() {
        System.out.println("=== RESULTADO DE LA SESIÓN DE FOTOS ===");
        camara.mostrarDetalles();
        impresion.mostrarDetalles();

        double total = impresion.calcularTotal(camara.sacarPrecio());
        System.out.println("----------------------------------------");
        System.out.println("💰 Precio total de impresión: $" + total);
        System.out.println("========================================");
    }

    public double getTotal() {
        return impresion.calcularTotal(camara.sacarPrecio());
    }
}
