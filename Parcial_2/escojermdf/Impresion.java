class Impresion extends Resultado {

    private String metodo;
    private int cantidad; // cantidad debe ser numérica, no String

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

    public double calcularTotal() {
        return sacarPrecioC() * cantidad;
    }

    public void mostrarDetalles() {
        System.out.println("Ya se realizó su impresión.");
        System.out.println("Método de impresión: " + metodo);
        System.out.println("Cantidad de impresiones: " + cantidad);
        System.out.println("Precio por unidad: $" + sacarPrecioC());
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}
