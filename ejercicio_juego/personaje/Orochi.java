package personaje;

class Orochi extends Personaje {
    public Orochi() {
        super("Orochi");
    }

    @Override
    public void ataquePoder(Personaje oponente) {
        int dano = 40; 
        oponente.recibirDano(dano);
        System.out.println(getNombre() + " tira segunda y hace " + dano + " puntos de daño.");
    }
}




