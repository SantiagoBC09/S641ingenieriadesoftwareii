package decorador;

abstract class DecoradorServicio implements In_yourbaber {
    protected In_yourbaber servicioBase;
    
    public DecoradorServicio(In_yourbaber servicio) {
        this.servicioBase = servicio;
    }
    
  @Override
    public String descripcion() {
        return servicioBase.descripcion();
    }
    
    @Override
    public double precio() {
        return servicioBase.precio();
    }
    
    @Override
    public int duracionMinutos() {
        return servicioBase.duracionMinutos();
    }
}