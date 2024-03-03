import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parqueadero {

    public static void main(String[] args){  
        int accion = 0;
        //Creamos los tipo de vehiculos
        TipoVehiculo carro = new TipoVehiculo("carro");
        TipoVehiculo moto =  new TipoVehiculo("moto");
        
        //Crear la lista de los esapcios del parqueadero
        List<Espacio> listaEspacios = new ArrayList<Espacio>();

        //Lleno los espacio en la lista
        for(int i=0; i < 3; i++){
            listaEspacios.add(new Espacio());  
        }

        Scanner entrada = new Scanner(System.in);

        while(accion != 4){
            ImprimirMenu();
            accion = entrada.nextInt();
            EjecutarAcciones(accion, listaEspacios, entrada, carro, moto);
            
        }
    }

    private static void EjecutarAcciones(int accion, List<Espacio> listaEspacios, Scanner entrada, TipoVehiculo carro, TipoVehiculo moto){
        if(accion == 1){
            OcuparEspacio(listaEspacios, entrada, carro, moto);
        }
        else if(accion == 2){
            DesocuparEspacio(entrada, listaEspacios);     
        }

        else if(accion == 3){
            MostarEspacios(listaEspacios);
        }
    }

    private static void DesocuparEspacio(Scanner entrada, List<Espacio> listaEspacios){
        System.out.print("ingrese la placa: ");
        String placa = entrada.next();
        Espacio itemEspacio = new Espacio().BuscarEspacioPorPlaca(placa, listaEspacios);

        if(itemEspacio != null){
            itemEspacio.DesocuparEspacio();
        }

    }

    private static void OcuparEspacio(List<Espacio> listaEspacios, Scanner entrada, TipoVehiculo carro, TipoVehiculo moto){
        Espacio itemEspacio = new Espacio().BuscarEspacioDesocupado(listaEspacios);
        if(itemEspacio != null){
            System.out.print("ingrese la placa: ");
            String placa = entrada.next();
            System.out.print("ingrese el color: ");
            String color = entrada.next();
            MostrarTiposVehiculo();
            System.out.println("ingrese el tipo de vehiculo: ");
            int tipo = entrada.nextInt();
            TipoVehiculo tipoV;
            if (tipo == 1){
                tipoV = carro;
            } 
            else{
                tipoV = moto;
            }
            itemEspacio.OcuparEspacio(placa, color, tipoV);
        }
    }

    private static void MostrarTiposVehiculo(){
        System.out.println("1. Carro");
        System.out.println("2. Moto");
    }

    private static void MostarEspacios(List<Espacio> listaEspacios){
        System.out.println("****************************************");
        for(Espacio itemEspacio: listaEspacios){
            itemEspacio.ImprimirEspacio();
        }
        System.out.println("****************************************");
    }

    private static void ImprimirMenu(){
        System.out.println("1. Ocupar un Espacio");
        System.out.println("2. Desocupar un Espacio");
        System.out.println("3. Ver los Espacios");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
    }
}