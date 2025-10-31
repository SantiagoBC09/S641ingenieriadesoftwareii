package decorador;

class Corte implements In_yourbaber {
    @Override
    public String getDescripcion() {
        return "Corte de Cabello";
    }
    
    @Override
    public double getPrecio() {
        return 25000.0; // $25,000 COP
    }
    
    @Override
    public int getDuracionMinutos() {
        return 30;
    }
}