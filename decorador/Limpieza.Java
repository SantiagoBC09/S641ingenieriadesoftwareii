class Limpieza extends DecoradorServicio {
    public Limpieza(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion() + " + Diseño de Uñas";
    }
    
    @Override
    public double getPrecio() {
        return servicioBase.getPrecio() + 15000.0;
    }
    
    @Override
    public int getDuracionMinutos() {
        return servicioBase.getDuracionMinutos() + 20;
    }
}