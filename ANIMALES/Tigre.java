public class Tigre extends Vertebrados {

//Atributos de la clase Tigre

    private int cantidadColmillos;
    private int pesoMaximo;


//Constructor de la clase tigre

    public Tigre() {
        System.out.println("Constructor desde la clase Tigre" ); 
    }


 //Metodos abstractos definidos anteriormente en la clase vertebrados

    public void alimentarse() {
    System.out.print("Soy de la familia de los vertebrados y soy un tigre carnivoro")

    }

    public void Habitar() {
       System.out.print("Vivo en los bosques tropicales") 
    }
     

    
}


