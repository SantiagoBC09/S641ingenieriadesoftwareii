package decorador;

class Keratina extends DecoradorServicio {
    public Keratina(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion() + " + Keratina";
    }
    
    @Override
    public double getPrecio() {
        return servicioBase.getPrecio() + 80000.0;
    }
    
    @Override
    public int getDuracionMinutos() {
        return servicioBase.getDuracionMinutos() + 120;
    }
}
