
public class Main {

    public static void Main (String[] args) {

        Monitor monitor1 = Monitor.getMonitor();  //Generando un nuevo objeto de tipo monitor
        Monitor monitor2 = Monitor.getMonitor();
        
        System.out.println(monitor1.hashCode()); //con el hashCode se imprime el codigo del objeto
        System.out.println(monitor2.hashCode());
    
    }   



}