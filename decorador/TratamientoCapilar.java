package decorador;

class TratamientoCapilar extends DecoradorServicio {
    public TratamientoCapilar(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String descripcion() {
        return servicioBase.descripcion() + " + Tratamiento Capilar";
    }
    
    @Override
    public double precio() {
        return servicioBase.precio() + 35000.0;
    }
    
    @Override
    public int duracionMinutos() {
        return servicioBase.duracionMinutos() + 30;
    }
}

