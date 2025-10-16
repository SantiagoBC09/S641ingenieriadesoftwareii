package main;

public class Vresultado {
    public static void main(String[] args) {

        // Creación de objetos mediante el patrón Factory
        Camara camara = FactoryCamara.crearCamara("Canon EOS 90D", "4K", "Excelente", "16:9 (horizontal)");
        Impresion impresion = ImpresionFactory.crearImpresion("A color", 10);
        Cliente cliente = FactoryCliente.crearCliente("1023456789", "Juan Pérez", "Boda");

        // Crear el resultado combinando los objetos
        Resultadof resultado = new Resultadof(camara, impresion, cliente);

        // Crear una foto con el resultado final
        Foto foto = new Foto(resultado);

        // Mostrar la factura final
        foto.mostrarFactura();
    }
}

