package decorador;

class Tinte extends DecoradorServicio {
    public Tinte(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion() + " + Tinte";
    }
    
    @Override
    public double getPrecio() {
        return servicioBase.getPrecio() + 45000.0;
    }
    
    @Override
    public int getDuracionMinutos() {
        return servicioBase.getDuracionMinutos() + 60;
    }
}