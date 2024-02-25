abstract public class Invertebrados extends Animales { 

//Atributos que comparten los de la clase Invertebrados 

 private int cantidadAntenas;
 private int cantidadPatas; 

//Constructor de la clase Invertebrados 
 
 public Invertebrados () { 
    System.out.println("constructor de la clase Invertebrados");

 }

//Metodos abstratos de los Invertebrados 

abstract public void alimentarse ();

}


//Se alimentan de otros seres vivos. Pueden ser herbívoros, carnívoros u omnívoros.
//Casi todos pueden desplazarse.
//Algunos animales, como las arañas, son ovíparos. Otros, como los lobos, son vivíparos.
//Además de no tener esqueleto interno, todos los invertebrados son ovíparos; es decir, nacen de huevos.
