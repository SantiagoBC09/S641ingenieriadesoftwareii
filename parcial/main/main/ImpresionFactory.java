package main;
class ImpresionFactory {
    public static Impresion crearImpresion(String metodo, int cantidad) {
        return new Impresion(metodo, cantidad);
    }
}