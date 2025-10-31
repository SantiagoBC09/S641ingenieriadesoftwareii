package decorador;

class Mechas extends DecoradorServicio {
    public Mechas(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion() + " + Mechas";
    }
    
    @Override
    public double getPrecio() {
        return servicioBase.getPrecio() + 60000.0;
    }
    
    @Override
    public int getDuracionMinutos() {
        return servicioBase.getDuracionMinutos() + 90;
    }
}
