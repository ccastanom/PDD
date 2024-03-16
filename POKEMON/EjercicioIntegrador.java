
public class EjercicioIntegrador {

    public static void main(String[] args){

        //Voy a crear los objetos de las clases desde el main
        Squirtle squirtle = new Squirtle ();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pika = new Pikachu();

        squirtle.atacarAranazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAranazo();
        bulbasaur.atacarDrenaje();
        pika.atacarAranazo();


        
    }

}