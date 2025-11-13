package decorador;


class Corte implements In_yourbaber {
  @Override
    public String descripcion() {
        return "Corte de Cabello";
    }
    
    @Override
    public double precio() {
        return 25000.0; // $25,000 COP
    }
    
    @Override
    public int duracionMinutos() {
        return 30;
    }
}