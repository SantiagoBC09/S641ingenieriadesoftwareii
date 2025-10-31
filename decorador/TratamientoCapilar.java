package decorador;

class TratamientoCapilar extends DecoradorServicio {
    public TratamientoCapilar(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String getDescripcion() {
        return servicioBase.getDescripcion() + " + Tratamiento Capilar";
    }
    
    @Override
    public double getPrecio() {
        return servicioBase.getPrecio() + 35000.0;
    }
    
    @Override
    public int getDuracionMinutos() {
        return servicioBase.getDuracionMinutos() + 30;
    }
}

