import java.util.List;

public class Espacio {

    public String Estado;
    private Vehiculo Vehiculo; 
/*
    public Espacio(String estado, Vehiculo vehiculo){
        Estado = estado;
        Vehiculo = vehiculo;
    }
*/

    public Espacio(){
        Estado = "Desocupado";
    }

    public void ImprimirEspacio(){
        System.out.println(this.Estado);
    }

    public void OcuparEspacio(String placa, String color, TipoVehiculo tipo){
        this.Estado = "Ocupado";
        this.Vehiculo = new Vehiculo(placa, color, tipo);
    }

    public void DesocuparEspacio(){
        this.Estado = "Desocupado";
        this.Vehiculo = null;
    }

    public static Espacio BuscarEspacioDesocupado(List<Espacio> listaEspacio){
        for(Espacio itemEspacio : listaEspacio){
            if (itemEspacio.Estado == "Desocupado"){
                return itemEspacio;
            }
        }
        System.out.println("****************************************************************");
        System.out.println("Todos los espacios se encuentran ocupados lo sentimos mucho :(");
        System.out.println("****************************************************************");
        return null;
    }

    public static Espacio BuscarEspacioPorPlaca(String placa, List<Espacio> listaEspacio){
        for(Espacio itemEspacio : listaEspacio) {
            if(itemEspacio.Estado == "Ocupado"){
                if (itemEspacio.Vehiculo.EslaPlaca(placa)){
                    return itemEspacio;
                }
            }
        }
        System.out.println("****************************************************************");
        System.out.println("No encontramos el vehiculo con esa placa :(");
        System.out.println("****************************************************************");
        return null;
    }
}