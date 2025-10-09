package personaje;

class Iori extends Personaje {
    public Iori() {
        super("Iori");
    }

    @Override
    public void ataquePoder(Personaje oponente) {
        int dano = 35; // daño fijo
        oponente.recibirDano(dano);
        System.out.println(getNombre() + " tira segunda y causa " + dano + " puntos de daño.");
    }
}

