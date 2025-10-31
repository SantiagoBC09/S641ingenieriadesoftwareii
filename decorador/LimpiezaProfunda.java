package decorador;

 class LimpiezaProfunda  extends DecoradorServicio {
    public LimpiezaProfunda(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion() + " + Limpieza Profunda";
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
