public class Squirtle extends Pokemon implements iAgua {

//Construyo el constructor
    public Squirtle() {
        
    }




//traigo los metodos abstractos de la clase Pokemon y los implemento como quiera

    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");

    }
    protected void atacarAranazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque arañazo");
    }

    protected void atacarMordisco(){
        System.out.println("Hola soy Squirtle y este es mi ataque mordisco");
    }
}
 
 //traigo los metodos de la interfaz iAgua y los implemento como quiera


    public void atacarHidrobomba () {
         System.out.println("Hola soy Squirtle y este es mi ataque ataqueHidrobomba");
    }

    public void atacarBurbuja(){
         System.out.println("Hola soy Squirtle y este es mi ataque atacarBurbuja");
    }