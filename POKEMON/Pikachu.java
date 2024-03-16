public class Pikachu extends Pokemon implements iElectrico {

//Construyo el constructor
    public Pikachu(){
        
    }


//traigo los metodos abstractos de la clase Pokemon y los implemento como quiera

    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");

    }
    protected void atacarAranazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque arañazo");
    }

    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }
}


//traigo los metodos abstractos de la interfaz iElectrico y los implemento como quiera

    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi atacque impactrueno");
    }

    public void atacarPunioFuego() {
        System.out.println("Hola soy Pikachu y este es mi ataque atacarPunioTrueno");
    }