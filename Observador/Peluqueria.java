package Observador;
import java.util.*;

class Peluqueria implements Sujeto {

    private List<Observador> observadores;
    private Cita estadoActual; // Estado que los observadores consultarán

    public Peluqueria() {
        observadores = new ArrayList<>();
    }

    @Override
    public void registrar(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void quitar(Observador obs) {
        observadores.remove(obs);
    }

    @Override
    public void notificar() {
        for (Observador obs : observadores) {
            obs.actualizar();
        }
    }

    
    public Cita obtenerEstado() {
        return estadoActual;
    }

    private void actualizarEstado(Cita cita, String nuevoEstado) {
        cita.setEstado(nuevoEstado);
        this.estadoActual = cita;
        notificar(); // notifica con el nuevo estado
    }


    public void crearCita(Cita cita) {
        actualizarEstado(cita, "CREADA");
    }

    public void confirmarCita(Cita cita) {
        actualizarEstado(cita, "CONFIRMADA");
    }

    public void cancelarCita(Cita cita) {
        actualizarEstado(cita, "CANCELADA");
    }
}
 
