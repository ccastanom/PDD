public class Producto {
    
    private String id;
    private String nombre;

    //constructor

    public Producto(){

    }
    public Producto (String id, String nombre){
        this.id = id 
        this.nombre = nombre;


    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }
    
    @Override
    public String toString(){
        return "Producto"
    }

}