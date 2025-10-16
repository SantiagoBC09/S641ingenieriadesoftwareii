package main;

public class Cliente {
    private String cedula;
    private String nombre;
    private String evento;

    public Cliente(String cedula, String nombre, String evento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.evento = evento;
    }

    public String getNombre() {
        return nombre;
    }
}
