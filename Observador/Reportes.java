package Observador;

public class Reportes implements Observador {

    private Peluqueria sujeto;
    private int citasCreadas = 0;
    private int citasCanceladas = 0;
    private int citasConfirmadas = 0;

    public Reportes(Peluqueria sujeto) {
        this.sujeto = sujeto;
    }

    @Override
    public void actualizar() {
        Cita c = sujeto.obtenerEstado();

        switch (c.getEstado()) {
            case "CREADA": citasCreadas++; break;
            case "CONFIRMADA": citasConfirmadas++; break;
            case "CANCELADA": citasCanceladas++; break;
        }

        System.out.println("REPORTE -> " + c.getEstado() + 
                           " Cliente: " + c.getCliente());
    }

    public void mostrarReporte() {
        System.out.println("\n====== REPORTE FINAL ======");
        System.out.println("Citas creadas: " + citasCreadas);
        System.out.println("Citas confirmadas: " + citasConfirmadas);
        System.out.println("Citas canceladas: " + citasCanceladas);
    }
}
