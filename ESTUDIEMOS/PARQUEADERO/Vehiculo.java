public class Vehiculo {
    private String Placa;
    private String Color;
    private TipoVehiculo Tipo;

    public Vehiculo(String placa, String color, TipoVehiculo tipo){
        Placa = placa;
        Color = color;
        Tipo = tipo;
    }

    public boolean EslaPlaca(String placa){
        if (this.Placa.equals(placa)){
            return true;
        }
        return false;
    }
}