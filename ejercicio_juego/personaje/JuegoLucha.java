package personaje;
import java.util.Scanner;

public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    // Constructor
    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    // Controlar la pelea
    public void iniciarPelea() {
        System.out.println(jugador1.getNombre() + " vs " + jugador2.getNombre());
        Scanner scanner = new Scanner(System.in);

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2, scanner);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1, scanner);
            }
        }

        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    // Turno de ataque
    private void turno(Personaje atacante, Personaje defensor, Scanner scanner) {
        System.out.println("\nTurno de " + atacante.getNombre() + ". HP" + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
        System.out.println("Elige ataque:");
        System.out.println("1. Golpe normal");
        System.out.println("2. Segunda");
        System.out.println("3. Tercera");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                atacante.atacar(defensor);
                break;
            case 2:
                atacante.ataquePoder(defensor);
                break;
            case 3:
                atacante.ataqueEspecial(defensor);
                break;
            default:
                System.out.println("no se puede. Se usará el ataque normal.");
                atacante.atacar(defensor);
        }

        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " HP.");
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- KOF 98 --");
        System.out.println("Personajes disponibles: Iori, Orochi, Kyo");

        System.out.print("Elige el personaje del jugador 1: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Elige el personaje del jugador 2: ");
        String nombre2 = scanner.nextLine();

        Personaje jugador1;
        Personaje jugador2;

        // Asignación según el nombre
        if (nombre1.equalsIgnoreCase("Iori")) {
            jugador1 = new Iori();
        } else if (nombre1.equalsIgnoreCase("Orochi")) {
            jugador1 = new Orochi();
        } else {
            jugador1 = new Kyo();
        }

        if (nombre2.equalsIgnoreCase("Iori")) {
            jugador2 = new Iori();
        } else if (nombre2.equalsIgnoreCase("Orochi")) {
            jugador2 = new Orochi();
        } else {
            jugador2 = new Kyo();
        }

        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
        juego.iniciarPelea();
    }
}

