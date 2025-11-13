package decorador;


class Barba extends DecoradorServicio {
    public Barba(In_yourbaber servicio) {
        super(servicio);
    }
    
     @Override
    public String descripcion() {
        return servicioBase.descripcion() + " + Barba";
    }
    
    @Override
    public double precio() {
        return servicioBase.precio() + 25000.0;
    }
    
    @Override
    public int duracionMinutos() {
        return servicioBase.duracionMinutos() + 30;
    }
}
