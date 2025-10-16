package main;

public class ImpresionFactory extends CreadorProducto {
    private int id;
    private String tipo;
    private int cantidad;

    public ImpresionFactory(int id, String tipo, int cantidad) {
        this.id = id;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public Producto crearProducto() {
        return new Impresion(id, tipo, cantidad);
    }
}
