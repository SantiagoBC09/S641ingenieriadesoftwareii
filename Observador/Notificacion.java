package Observador;

public class Notificacion implements Observador {

    private Peluqueria sujeto;

    public Notificacion(Peluqueria sujeto) {
        this.sujeto = sujeto;
    }

    @Override
    public void actualizar() {
        Cita c = sujeto.obtenerEstado();
        System.out.println("SMS  Cliente: " + c.getCliente() +
                           "Estado de su cita: " + c.getEstado());
    }
}
 
