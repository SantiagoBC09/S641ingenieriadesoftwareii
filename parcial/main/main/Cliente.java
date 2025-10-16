package main;

public class Cliente {
    private String id;
    private String nombre;
    private String evento;

    public Cliente(String id, String nombre, String evento) {
        this.id = id;
        this.nombre = nombre;
        this.evento = evento;
    }

    public String getNombre() {
        return nombre + id + evento;
    }
}
