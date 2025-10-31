package decorador;

public class Main {
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("   SISTEMA DE RESERVAS - PELUQUERÍA ELEGANTE");
        System.out.println("═══════════════════════════════════════════════\n");
        
        // Cita 1: Corte simple
        In_yourbaber servicio1 = new Corte();
        Cita cita1 = new Cita("María García", "2025-11-05", "10:00 AM", servicio1);
        cita1.imprimirResumen();
        
        // Cita 2: Corte con tinte
        In_yourbaber servicio2 = new Corte();
        servicio2 = new Tinte(servicio2);
        Cita cita2 = new Cita("Laura Martínez", "2025-11-05", "11:00 AM", servicio2);
        cita2.imprimirResumen();
        
        // Cita 3: Corte completo con tinte, tratamiento y masaje
        In_yourbaber servicio3 = new Corte();
        servicio3 = new Tinte(servicio3);
        servicio3 = new TratamientoCapilar(servicio3);
        servicio3 = new MasajeCapilar(servicio3);
        Cita cita3 = new Cita("Ana Rodríguez", "2025-11-05", "02:00 PM", servicio3);
        cita3.imprimirResumen();
        
        // Cita 4: Manicure con diseño y esmalte semipermanente
        In_yourbaber servicio4 = new Manicure();
        servicio4 = new Limpieza(servicio4);
        servicio4 = new EsmalteSemipermanente(servicio4);
        Cita cita4 = new Cita("Sofía López", "2025-11-06", "09:00 AM", servicio4);
        cita4.imprimirResumen();
        
        // Cita 5: Paquete completo de lujo
        In_yourbaber servicio5 = new Corte();
        servicio5 = new Mechas(servicio5);
        servicio5 = new Keratina(servicio5);
        servicio5 = new MasajeCapilar(servicio5);
        Cita cita5 = new Cita("Isabella Torres", "2025-11-06", "10:00 AM", servicio5);
        cita5.imprimirResumen();
        
        // Cita 6: Manicure y Pedicure combinado (no se puede con el diseño actual,
        // pero podemos simular servicios múltiples)
        
        
        // Cita 7: Depilación con tratamiento
        In_yourbaber servicio7 = new Corte();
        servicio7 = new TratamientoCapilar(servicio7);
        Cita cita7 = new Cita("Valentina Gómez", "2025-11-07", "11:00 AM", servicio7);
        cita7.imprimirResumen();
        
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("   ESTADÍSTICAS DEL DÍA");
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("Total de citas programadas: 7");
        System.out.println("Servicios más solicitados: Corte, Manicure");
        System.out.println("═══════════════════════════════════════════════");
    }
}
