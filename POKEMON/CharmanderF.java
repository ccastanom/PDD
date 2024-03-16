public class CharmanderF extends Pokemon implements iFuego {

//Construyo el constructor
    public Charmander(){
        
    }


//traigo los metodos abstractos de la clase Pokemon y los implemento como quiera

    protected void atacarPlacaje() {
        System.out.println("Hola soy CharmanderF y este es mi ataque placaje");

    }
    protected void atacarAranazo() {
        System.out.println("Hola soy Charmander y este es mi ataque arañazo");
    }

    protected void atacarMordisco(){
        System.out.println("Hola soy Charmander y este es mi ataque mordisco");
    }
}

//traigo los metodos de la interfaz iFuego

    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque atacarPunioFuego");

    }

    public void atacarLanzaLlamas() {
        System.out.println("Hola soy Charmander y este es mi ataque atacarLanzaLlamas");
    }

    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque atacarAscuas");

    }
