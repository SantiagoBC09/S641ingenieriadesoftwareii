package decorador;

class Corte implements In_yourbaber {
    @Override
    public String getDescripcion() {
        return "Corte de Cabello";
    }
    
    @Override
    public double getPrecio() {
        return 15000.0; 
    }
    
    @Override
    public int getDuracionMinutos() {
        return 30;
    }
}