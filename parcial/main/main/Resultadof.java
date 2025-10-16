package main;


public class Resultadof {

    private Camara camara;
    private Impresion impresion;
    private Cliente cliente;

 
    public Resultadof(Camara camara, Impresion impresion, Cliente cliente) {
        this.camara = camara;
        this.impresion = impresion;
        this.cliente = cliente;
    }

    public void mostrarResultado() {
        
    
     System.out.println("--| RESULTADO DE LA SESIÓN DE FOTOS |--");
        
        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Razón de la sesión: " + cliente.getRazon());
        }

        System.out.println();
        camara.mostrarDetalles();
        impresion.mostrarDetalles();

        double total = impresion.calcularTotal(camara.sacarPrecio());
        System.out.println("----------------------------------------");
        System.out.println("Precio total de impresion: $" + total);
        System.out.println("----------------------------------------");
    }

    public double getTotal() {
        return impresion.calcularTotal(camara.sacarPrecio());
    }
}
