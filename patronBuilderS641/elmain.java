public class elmain {
    public static void main(String[] args) {
        
        // esto es para crear convertidores
        Converter pdf = new PDFConverter();
        Converter ascii = new ASCIIConverter();
        Converter ps = new PostScriptConvert();

        // esto es para crear lectores con diferentes elementos
        Reader lector1 = new Reader("LINE", pdf);
        Reader lector2 = new Reader("PRAGRAPH", ascii);
        Reader lector3 = new Reader("TABLE", ps);
        Reader lector4 = new Reader("CIRCLE", pdf); // Caso no válido

        // esto es para probar parseInput
        lector1.parseInput(); // Línea con PDF
        lector2.parseInput(); // Párrafo con ASCII
        lector3.parseInput(); // Tabla con PostScript
        lector4.parseInput(); // Opción no válida
    }
}

