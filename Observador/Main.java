package Observador;

public class Main {
    public static void main(String[] args) {

        Peluqueria peluqueria = new Peluqueria();

        Observador sms = new Notificacion(peluqueria);
        Observador agenda = new Agenda(peluqueria);
        Reportes reporte = new Reportes(peluqueria);

        peluqueria.registrar(sms);
        peluqueria.registrar(agenda);
        peluqueria.registrar(reporte);

        Cita c1 = new Cita("María García", "Corte y Tinte", "2025-11-20 10:00");
        Cita c2 = new Cita("Laura Martínez", "Manicure", "2025-11-20 14:00");

        peluqueria.crearCita(c1);
        peluqueria.confirmarCita(c1);
        peluqueria.crearCita(c2);
        peluqueria.cancelarCita(c2);

        reporte.mostrarReporte();
    }
}

