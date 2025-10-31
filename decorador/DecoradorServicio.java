package decorador;

abstract class DecoradorServicio implements In_yourbaber {
    protected In_yourbaber servicioBase;
    
    public DecoradorServicio(In_yourbaber servicio) {
        this.servicioBase = servicio;
    }
    
    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion();
    }
    
    @Override
    public double getPrecio() {
        return servicioBase.getPrecio();
    }
    
    @Override
    public int getDuracionMinutos() {
        return servicioBase.getDuracionMinutos();
    }
}