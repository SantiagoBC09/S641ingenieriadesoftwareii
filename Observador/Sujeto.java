package Observador;

interface Sujeto {
    void registrar(Observador observador);
    void quitar(Observador observador);
    void notificar();
}

