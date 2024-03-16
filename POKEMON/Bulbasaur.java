
public class Bulbasaur extends Pokemon implements iPlanta {

//Construyo el constructor
    public Bulbasaur(){
        
    }



//implemento la interface porque es de tipo planta y  al implementarlo me va a permitir tener los ataques de tipo planta, es decir los metodos exclusivos de su tipo 

//traigo los metodos abstractos de la clase Pokemon y los implemento como quiera

    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");

    }
    protected void atacarAranazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque arañazo");
    }

    protected void atacarMordisco(){
        System.out.println("Hola soy Bulbasaur y este es mi ataque mordisco");
    }

    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque drenaje");
    }

    public void atacarParalizar() {
       System.out.println("Hola soy Bulbasaur y este es mi ataque paralizar")
        }

}