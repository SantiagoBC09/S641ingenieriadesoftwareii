package decorador;

class MasajeCapilar extends DecoradorServicio {
    public MasajeCapilar(In_yourbaber servicio) {
        super(servicio);
    }
    
   @Override
    public String descripcion() {
        return servicioBase.descripcion() + " + Masaje Capilar";
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


