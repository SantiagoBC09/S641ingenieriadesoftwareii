package decorador;

class Manicure implements In_yourbaber {
    @Override
    public String getDescripcion() {
        return "Manicure";
    }
    
    @Override
    public double getPrecio() {
        return 20000.0;
    }
    
    @Override
    public int getDuracionMinutos() {
        return 45;
    }
}
