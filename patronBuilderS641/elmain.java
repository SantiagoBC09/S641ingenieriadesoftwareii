public class elmain {
    public static void main(String[] args) {
        
        // esto es para crear convertidores
        Converter PDF = new PDFConverter();
        Converter ASCII = new ASCIIConverter();
        Converter PostScript = new PostScriptConvert();
        Converter Word = new WordConverter();
        // esto es para crear lectores con diferentes elementos
        Reader lector1 = new Reader("LINE", PDF);
        Reader lector2 = new Reader("PRAGRAPH", ASCII);
        Reader lector3 = new Reader("TABLE", PostScript);
        Reader lector4 = new Reader("TABLE", Word);

        // esto es para probar parseInput
        lector1.parseInput(); 
        lector2.parseInput(); 
        lector3.parseInput();
        lector4.parseInput(); 
        
    }
}

