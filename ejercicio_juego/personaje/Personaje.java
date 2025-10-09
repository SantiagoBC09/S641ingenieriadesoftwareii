package personaje;

import java.util.Random;

class Personaje {
    private String nombre;
    private int puntosDeVida;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    // Constructor
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    // Ataque normal
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }

    // Ataque con poder 
    public void ataquePoder(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt(21) + 20; // entre 20 y 40
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " usa un ataque con poder y causa " + dano + " puntos de daño.");
    }

    // Ataque especial: quita la mitad de la vida del oponente
    public void ataqueEspecial(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt(26) + 25; //;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " Tira tercera, le quita " + dano + " y deja a " + oponente.getNombre() + " con " + oponente.getPuntosDeVida() + " de HP");
    }

    // Método para recibir daño
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    // Verifica si sigue vivo
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}
