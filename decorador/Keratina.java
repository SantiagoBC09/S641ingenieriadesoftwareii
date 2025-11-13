package decorador;

class Keratina extends DecoradorServicio {
    public Keratina(In_yourbaber servicio) {
        super(servicio);
    }
    
   @Override
    public String descripcion() {
        return servicioBase.descripcion() + " + Keratina";
    }
    
    @Override
    public double precio() {
        return servicioBase.precio() + 80000.0;
    }
    
    @Override
    public int duracionMinutos() {
        return servicioBase.duracionMinutos() + 120;
    }
}