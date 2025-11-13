package decorador;

class Cita {
    private In_yourbaber servicio;
    private String nombreCliente;
    private String fecha;
    private String hora;
    
    public Cita(String nombreCliente, String fecha, String hora, In_yourbaber servicio) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.hora = hora;
        this.servicio = servicio;
    }
    
    public void imprimirResumen() {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║         CONFIRMACIÓN DE CITA                   ║");
        System.out.println("╚════════════════════════════════════════════════╝");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("------------------------------------------------");
        System.out.println("Servicios: " + servicio.descripcion());
        System.out.println("------------------------------------------------");
        System.out.println("Duración estimada: " + servicio.duracionMinutos() + " minutos");
        System.out.println("Precio Total: $" + String.format("%.0f", servicio.precio()) + " COP");
        System.out.println("================================================\n");
    }
}
