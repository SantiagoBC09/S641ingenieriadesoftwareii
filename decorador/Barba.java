package decorador;

class Barba extends DecoradorServicio {
    public Barba(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion() + " + Barba";
    }
    
    @Override
    public double getPrecio() {
        return servicioBase.getPrecio() + 4000.0;
    }
    
    @Override
    public int getDuracionMinutos() {
        return servicioBase.getDuracionMinutos() + 90;
    }
}
