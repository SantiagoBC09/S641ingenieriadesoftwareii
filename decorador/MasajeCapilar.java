package decorador;

class MasajeCapilar extends DecoradorServicio {
    public MasajeCapilar(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion() + " + Masaje Capilar";
    }
    
    @Override
    public double getPrecio() {
        return servicioBase.getPrecio() + 20000.0;
    }
    
    @Override
    public int getDuracionMinutos() {
        return servicioBase.getDuracionMinutos() + 15;
    }
}
