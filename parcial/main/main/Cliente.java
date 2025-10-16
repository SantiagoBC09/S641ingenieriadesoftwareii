package main;
class Cliente {

    private String identificacion;
    private String nombre;
    private String razon; // motivo de la sesión (boda, graduación, etc.)

    public Cliente(String identificacion, String nombre, String razon) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.razon = razon;
    }

    public void mostrarDatos() {
        System.out.println("Cliente: " + nombre);
        System.out.println("ID: " + identificacion);
        System.out.println("Razón de las fotos: " + razon);
    }

    public String getIdentificacion() { return identificacion; }
    public String getNombre() { return nombre; }
    public String getRazon() { return razon; }
}
