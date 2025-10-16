package main;

import java.util.Scanner;

public class Vresultado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CREACIÓN DE CLIENTE ===");
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su identificación: ");
        String id = sc.nextLine();

        System.out.println("Seleccione la razón de las fotos:");
        System.out.println("1. Boda");
        System.out.println("2. Graduación");
        System.out.println("3. Cumpleaños");
        System.out.println("4. Evento empresarial");
        System.out.print("Opción: ");
        int opRazon = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        String razon;
        switch (opRazon) {
            case 1 : razon = "Boda";
            case 2 : razon = "Graduación";
            case 3 : razon = "Cumpleaños";
            case 4 : razon = "Evento empresarial";
            default : razon = "Sesión general";
        }

        Cliente cliente = FactoryCliente.crearCliente(id, nombre, razon);

        System.out.println("\n--- SELECCIÓN DE CÁMARA ---");

        System.out.println("Seleccione la calidad:");
        System.out.println("1. 720p");
        System.out.println("2. 1K");
        System.out.println("3. 2K");
        System.out.println("4. 4K");
        System.out.print("Opción: ");
        int opCalidad = sc.nextInt();
        sc.nextLine();

        String calidad;
        switch (opCalidad) {
            case 1 : calidad = "720p";
            case 2 : calidad = "1K";
            case 3 : calidad = "2K";
            case 4 : calidad = "4K";
            default : calidad = "720p";
        }

        System.out.println("\nSeleccione el formato:");
        System.out.println("1. 1:1 (cuadrado)");
        System.out.println("2. 4:5 (medio cuadrado)");
        System.out.println("3. 9:16 (vertical)");
        System.out.println("4. 16:9 (horizontal)");
        System.out.print("Opción: ");
        int opFormato = sc.nextInt();
        sc.nextLine();

        String formato;
        switch (opFormato) {
            case 1 : formato = "1:1 (cuadrado)";
            case 2 : formato = "4:5 (medio cuadrado)";
            case 3 : formato = "9:16 (vertical)";
            case 4 : formato = "16:9 (horizontal)";
            default : formato = "16:9 (horizontal)";
        }

        System.out.println("\nSeleccione el modelo de cámara:");
        System.out.println("1. Canon EOS 90D");
        System.out.println("2. Nikon D7500");
        System.out.println("3. Sony Alpha 7 IV");
        System.out.println("4. Fujifilm X-T4");
        System.out.print("Opción: ");
        int opModelo = sc.nextInt();
        sc.nextLine();

        String modelo;
        switch (opModelo) {
            case 1 : modelo = "Canon EOS 90D";
            case 2 : modelo = "Nikon D7500";
            case 3 : modelo = "Sony Alpha 7 IV";
            case 4 : modelo = "Fujifilm X-T4";
            default : modelo = "Canon EOS 90D";
        }

        Camara camara = FactoryCamara.crearCamara(modelo, calidad, "Excelente", formato);

        System.out.println("\n--- SELECCIÓN DE IMPRESIÓN ----");
        System.out.println("1. A color");
        System.out.println("2. A blanco y negro");
        System.out.print("Opción: ");
        int opMetodo = sc.nextInt();

        String metodo = (opMetodo == 1) ? "A color" : "A blanco y negro";

        System.out.print("Cantidad de impresiones: ");
        int cantidad = sc.nextInt();

        Impresion impresion = ImpresionFactory.crearImpresion(metodo, cantidad);

        // Combinar todo
        Resultadof resultado = new Resultadof(camara, impresion, cliente);
        Foto foto = new Foto(resultado);

        

        // Mostrar factura final
        System.out.println();
        foto.mostrarFactura();

        sc.close();
    }
}
