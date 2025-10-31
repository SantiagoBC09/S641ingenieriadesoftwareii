package decorador;

class Pedicure implements In_yourbaber {
    @Override
    public String getDescripcion() {
        return "Pedicure";
    }
    
    @Override
    public double getPrecio() {
        return 25000.0;
    }
    
    @Override
    public int getDuracionMinutos() {
        return 60;
    }
}
