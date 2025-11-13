package decorador;

class Tinte extends DecoradorServicio {
    public Tinte(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String descripcion() {
        return servicioBase.descripcion() + " + Tinte";
    }
    
    @Override
    public double precio() {
        return servicioBase.precio() + 45000.0;
    }
    
    @Override
    public int duracionMinutos() {
        return servicioBase.duracionMinutos() + 60;
    }
}