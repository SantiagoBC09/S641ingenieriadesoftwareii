// Clase Impresion
class Impresion {

    private String metodo;
    private int cantidad;

    public Impresion(String metodo, int cantidad) {
        this.metodo = metodo;
        this.cantidad = cantidad;
    }

    public double sacarPrecioC() {
        double precioMetodo;

        switch (metodo.toLowerCase()) {
            case "a color":
                precioMetodo = 2000;
                break;
            case "a blanco y negro":
                precioMetodo = 1500;
                break;
            default:
                precioMetodo = 1000;
                break;
        }

        return precioMetodo;
    }

    public double calcularTotal(double precioFoto) {
        // Precio total = precio de foto * cantidad + costo de impresión por unidad
        return (precioFoto + sacarPrecioC()) * cantidad;
    }

    public void mostrarDetalles() {
        System.out.println("Método de impresión: " + metodo);
        System.out.println("Cantidad de impresiones: " + cantidad);
        System.out.println("Costo de impresión por unidad: $" + sacarPrecioC());
    }

    public String getMetodo() {
        return metodo;
    }

    public int getCantidad() {
        return cantidad;
    }
}

