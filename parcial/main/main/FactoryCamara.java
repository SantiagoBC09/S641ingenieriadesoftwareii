package main;

public class FactoryCamara {
    public static Camara crearCamara(String modelo, String calidad, String estado, String formato) {
        return new Camara(modelo, calidad, estado, formato);
    }
}
