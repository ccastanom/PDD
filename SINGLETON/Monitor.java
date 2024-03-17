
public class Monitor {

//Objeto mMonitor de tipo Monitor privado que tambien le pertenezca a la clase, por eso va Static

    private static Monitor mMonitor;

    }


    private Monitor() { } //constructor privado

    public static Monitor getMonitor(){
      
        return mMonitor   //retorna un objeto de tipo monitor
    }
    

    

}