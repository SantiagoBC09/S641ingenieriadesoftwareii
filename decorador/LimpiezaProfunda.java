package decorador;

 class LimpiezaProfunda  extends DecoradorServicio {
    public LimpiezaProfunda(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String descripcion() {
        return servicioBase.descripcion() + " + Limpieza Profunda";
    }
    
    @Override
    public double precio() {
        return servicioBase.precio() + 60000.0;
    }
    
    @Override
    public int duracionMinutos() {
        return servicioBase.duracionMinutos() + 90;
    }
}
