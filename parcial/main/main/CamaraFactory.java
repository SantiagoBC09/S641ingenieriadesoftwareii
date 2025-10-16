package main;

public class CamaraFactory extends CreadorProducto {
    private int id;
    private String marca;
    private String modelo;
    private String calidad;
    private String formato;

    public CamaraFactory(int id, String marca, String modelo, String calidad, String formato) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        

    }

    @Override
    public Producto crearProducto() {
        return new Camara(id, marca, modelo, calidad, formato);
    }
}
