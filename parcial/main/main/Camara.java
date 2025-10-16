package main;

public class Camara extends Producto {

    private String marca;
    private String calidad;
    private String modelo;
    private String formato;

    public Camara(int numero, String marca, String modelo, String calidad, String formato) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
        this.calidad = calidad;
        this.formato = formato;
    }

    @Override
    
//Aqui se calculan los precios teniendo en cuenta lo que quiere el cliente
    public double calcularPrecio() {
        double precioCalidad;
        double precioFormato;

        switch (calidad.toLowerCase()) {
            case "720p": precioCalidad = 10000; break;
            case "1k": precioCalidad = 15000; break;
            case "2k": precioCalidad = 20000; break;
            case "4k": precioCalidad = 50000; break;
            default: precioCalidad = 5000; break;
        }

        switch (formato.toLowerCase()) {
            case "1:1 (cuadrado)": precioFormato = 3000; break;
            case "4:5 (medio cuadrado)": precioFormato = 4000; break;
            case "9:16 (vertical)": precioFormato = 5000; break;
            case "16:9 (horizontal)": precioFormato = 7000; break;
            default: precioFormato = 2000; break;
        }

        return precioCalidad + precioFormato;
    }

     public String getNombre() {
        return modelo;
    }
}
