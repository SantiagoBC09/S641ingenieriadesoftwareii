package personaje;

class Kyo extends Personaje {
    public Kyo() {
        super("Kyo");
    }

    @Override
    public void ataquePoder(Personaje oponente) {
        int dano = 30; // más equilibrado
        oponente.recibirDano(dano);
        System.out.println(getNombre() + " tira segunda y causa " + dano + " puntos de daño.");
    }
}

