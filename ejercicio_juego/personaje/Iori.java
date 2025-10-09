package personaje;

class Iori extends Personaje {
    public Iori() {
        super("Iori");
    }

    @Override
    public void ataquePoder(Personaje oponente) {
        int dano = 35; // daño fijo
        oponente.recibirDano(dano);
        System.out.println(getNombre() + " usa su ataque de fuego oscuro y causa " + dano + " puntos de daño.");
    }
}

