package main;
class FactoryCliente {
    public static Cliente crearCliente(String identificacion, String nombre, String razon) {
        return new Cliente(identificacion, nombre, razon);
    }
}

