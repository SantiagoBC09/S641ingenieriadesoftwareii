package Observador;

public class Cita {
    private String cliente;
    private String servicio;
    private String fechaHora;
    private String estado;

    public Cita(String cliente, String servicio, String fechaHora) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.fechaHora = fechaHora;
        this.estado = "CREADA";
    }

    public String getCliente() { return cliente; }
    public String getServicio() { return servicio; }
    public String getFechaHora() { return fechaHora; }
    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return cliente + " | " + servicio + " | " + fechaHora + " | Estado: " + estado;
    }
}

