package main;

import java.util.Scanner;

public class Vresultado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE FOTOGRAFÍA ===");

        // crear cliente 
        System.out.println("\n--- DATOS DEL CLIENTE ---");
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su identificación: ");
        String id = sc.nextLine();
        System.out.print("Ingrese su numero de tarjeta de credito: ");
        String numeroTarjetaCredito  = sc.nextLine();

        System.out.println("Seleccione la razón de las fotos:");
        System.out.println("1. Boda");
        System.out.println("2. Graduación");
        System.out.println("3. Cumpleaños");
        System.out.print("Opción: ");
        int opRazon = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer del scanner

        String razon;
        switch (opRazon) {
            case 1:
                razon = "Boda";
                break;
            case 2:
                razon = "Graduación";
                break;
            case 3:
                razon = "Cumpleaños";
                break;
            default:
                razon = "Evento General";
        }
        Cliente cliente = new Cliente(id, nombre, razon);
        System.out.println("Cliente '" + cliente.getNombre() + "' creado exitosamente.");

        // --- Seleccionar cámara de forma interactiva ---
        System.out.println("\n--- SELECCIÓN DE CÁMARA ---");
        System.out.println("Seleccione el modelo de cámara:");
        System.out.println("1. Canon EOS 90D");
        System.out.println("2. Nikon D7500");
        System.out.println("3. Sony Alpha 7 IV");
        System.out.print("Opción: ");
        int opModelo = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        String marca, modelo;
        switch (opModelo) {
            case 1:
                marca = "Canon";
                modelo = "EOS 90D";
                break;
            case 2:
                marca = "Nikon";
                modelo = "D7500";
                break;
            case 3:
                marca = "Sony";
                modelo = "Alpha 7 IV";
                break;
            default:
                System.out.println("Opción no válida. Se asignará Canon EOS 90D por defecto.");
                marca = "Canon";
                modelo = "EOS 90D";
        }

        // --- 👇 NUEVO: Selección de Calidad ---
        System.out.println("\nSeleccione la calidad de la imagen:");
        System.out.println("1. 720p");
        System.out.println("2. 1K");
        System.out.println("3. 2K");
        System.out.println("4. 4K");
        System.out.print("Opción: ");
        int opCalidad = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        String calidad;
        switch (opCalidad) {
            case 1: calidad = "720p"; break;
            case 2: calidad = "1k"; break;
            case 3: calidad = "2k"; break;
            case 4: calidad = "4k"; break;
            default:
                System.out.println("Opción no válida. Se asignará 720p por defecto.");
                calidad = "720p";
        }

        // --- 👇 NUEVO: Selección de Formato ---
        System.out.println("\nSeleccione el formato de la imagen:");
        System.out.println("1. 1:1 (cuadrado)");
        System.out.println("2. 4:5 (medio cuadrado)");
        System.out.println("3. 9:16 (vertical)");
        System.out.println("4. 16:9 (horizontal)");
        System.out.print("Opción: ");
        int opFormato = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        String formato;
        switch (opFormato) {
            case 1: formato = "1:1 (cuadrado)"; break;
            case 2: formato = "4:5 (medio cuadrado)"; break;
            case 3: formato = "9:16 (vertical)"; break;
            case 4: formato = "16:9 (horizontal)"; break;
            default:
                System.out.println("Opción no válida. Se asignará 16:9 por defecto.");
                formato = "16:9 (horizontal)";
        }

        // --- Creación del objeto Camara con todas las opciones ---
        Camara camara = new Camara(1, marca, modelo, calidad, formato);
        System.out.println("Cámara configurada: " + camara.getNombre() + " (" + calidad + ", " + formato + ")");

        // --- Seleccionar impresión de forma interactiva (sin cambios) ---
        System.out.println("\n--- SELECCIÓN DE IMPRESIÓN ---");
        System.out.println("Seleccione el tipo de impresión:");
        System.out.println("1. A color");
        System.out.println("2. A blanco y negro");
        System.out.print("Opción: ");
        int opMetodo = sc.nextInt();
        sc.nextLine();

        String tipoImpresion = (opMetodo == 1) ? "A color" : "A blanco y negro";

        System.out.print("Ingrese la cantidad de impresiones: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Impresion impresion = new Impresion(2, tipoImpresion, cantidad);
        System.out.println("Impresiones seleccionadas: " + cantidad + " (" + tipoImpresion + ")");

        // --- Crear y mostrar el pedido ---
        Producto[] productos = { camara, impresion };
        Pedido pedido = new Pedido(cliente, productos, 12345678);

        // Mostrar la factura (pedido total)
        pedido.mostrarFactura();

        // Simulación de cálculo progresivo del precio
        System.out.print("\nCalculando precio total, espere un momento");
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(3000); // Espera 1 segundo
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mostrar total final
        System.out.println("\nPrecio total: $" + pedido.calcularTotal());
        System.out.println("¡Gracias por su compra en PicImpresions");

        sc.close();
    }
}