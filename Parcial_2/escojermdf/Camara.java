// Clase Camara
class Camara {

    private String modelo;
    private String calidad;
    private String formato;

    public Camara(String modelo, String calidad, String formato) {
        this.modelo = modelo;
        this.calidad = calidad;
        this.formato = formato;
    }

    public double sacarPrecio() {
        double precioCalidad;
        double precioFormato;

        switch (calidad.toLowerCase()) {
            case "720p":
                precioCalidad = 10000;
                break;
            case "1k":
                precioCalidad = 15000;
                break;
            case "2k":
                precioCalidad = 20000;
                break;
            case "4k":
                precioCalidad = 50000;
                break;
            default:
                precioCalidad = 5000;
                break;
        }

        switch (formato.toLowerCase()) {
            case "1:1 (cuadrado)":
                precioFormato = 3000;
                break;
            case "4:5 (medio cuadrado)":
                precioFormato = 4000;
                break;
            case "9:16 (vertical)":
                precioFormato = 5000;
                break;
            case "16:9 (horizontal)":
                precioFormato = 7000;
                break;
            default:
                precioFormato = 2000;
                break;
        }

        return precioCalidad + precioFormato;
    }

    public void mostrarDetalles() {
        System.out.println("📸 Cámara utilizada: " + modelo);
        System.out.println("Calidad: " + calidad);
        System.out.println("Formato: " + formato);
        System.out.println("Precio por foto: $" + sacarPrecio());
    }

    public String getModelo() {
        return modelo;
    }

    public String getCalidad() {
        return calidad;
    }

    public String getFormato() {
        return formato;
    }
}



