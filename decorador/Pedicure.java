package decorador;

class Pedicure implements In_yourbaber {
   @Override
    public String descripcion() {
        return "Pedicure";
    }
    
    @Override
    public double precio() {
        return 25000.0;
    }
    
    @Override
    public int duracionMinutos() {
        return 60;
    }
}
