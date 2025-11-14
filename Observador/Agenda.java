package Observador;

class Agenda implements Observador {

    private Peluqueria sujeto;

    public Agenda(Peluqueria sujeto) {
        this.sujeto = sujeto;
    }

    @Override
    public void actualizar() {
        Cita c = sujeto.obtenerEstado();
        System.out.println("\n AGENDA -> Actualizando registro: " + c);
    }
}
