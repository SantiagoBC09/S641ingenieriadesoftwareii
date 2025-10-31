package decorador;

public class Main {

    private static void procesando(String mensaje) {
        try {
            System.out.print(mensaje);
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500);
                System.out.print(".");
            }
            System.out.println(" ✓\n");
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("   Bienvenido a Yourbaber");
        System.out.println("═══════════════════════════════════════════════\n");
        
        procesando("Cargando sistema");
        
        // Cita 1: Corte simple
        procesando("Procesando Cita #1");

        // Cita 1: Corte simple
        In_yourbaber servicio1 = new Corte();
        Cita cita1 = new Cita("Alvaro García", "2025-11-05", "10:00 AM", servicio1);
        cita1.imprimirResumen();

        procesando("Procesando Cita #2");
        
        // Cita 2: Corte con tinte
        In_yourbaber servicio2 = new Corte();
        servicio2 = new Tinte(servicio2);
        Cita cita2 = new Cita("Mauricio Martínez", "2025-11-05", "11:00 AM", servicio2);
        cita2.imprimirResumen();

        procesando("Procesando Cita #3");
        
        // Cita 3: Corte completo con tinte, tratamiento y masaje
        In_yourbaber servicio3 = new Corte();
        servicio3 = new Tinte(servicio3);
        servicio3 = new TratamientoCapilar(servicio3);
        servicio3 = new MasajeCapilar(servicio3);
        Cita cita3 = new Cita("Ana Rodríguez", "2025-11-05", "02:00 PM", servicio3);
        cita3.imprimirResumen();
        
        
        procesando("Procesando Cita #4");
        // Cita 4: Paquete completo de lujo
        In_yourbaber servicio4 = new Corte();
        servicio4 = new Barba(servicio4);
        servicio4 = new Keratina(servicio4);
        servicio4 = new MasajeCapilar(servicio4);
        Cita cita4 = new Cita("Alvaro Torres", "2025-11-06", "10:00 AM", servicio4);
        cita4.imprimirResumen();
        
        procesando("Procesando Cita #5");
        // Cita 6: Depilación con tratamiento
        In_yourbaber servicio5 = new Pedicure();
        servicio5 = new TratamientoUñas(servicio5);
        servicio5 = new LimpiezaProfunda(servicio5);
        Cita cita5 = new Cita("Valentina Gómez", "2025-11-07", "11:00 AM", servicio5);
        cita5.imprimirResumen();
        
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("   ESTADÍSTICAS DEL DÍA");
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("Total de citas programadas: 5");
        System.out.println("═══════════════════════════════════════════════");
    }
}