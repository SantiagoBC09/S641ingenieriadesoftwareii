package decorador;

class TratamientoUñas extends DecoradorServicio {
    public TratamientoUñas(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion() + " + Tratamiento Capilar";
    }
    
    @Override
    public double getPrecio() {
        return servicioBase.getPrecio() + 25000.0;
    }
    
    @Override
    public int getDuracionMinutos() {
        return servicioBase.getDuracionMinutos() + 30;
    }
}

