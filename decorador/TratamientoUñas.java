package decorador;

class TratamientoUñas extends DecoradorServicio {
    public TratamientoUñas(In_yourbaber servicio) {
        super(servicio);
    }
    
    @Override
    public String descripcion() {
        return servicioBase.descripcion() + " + Tratamiento Uñas";
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

