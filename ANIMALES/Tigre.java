public class Tigre extends Vertebrados {
    protected int cantidadColmillos;
    protected int pesoMaximo;


//Constructor de la clase tigre

    public Tigre (){
        System.out.println("Constructor desde la clase tigre" ); 
    }


 //Metodos abstractos definidos anteriormente en la clase vertebrados

    public void alimentarse ();{
    System.out.print("Soy de la familia de los vertebrados y soy un tigre carnivoro")

    }

    public void Habitar ();{
       System.out.print("Vivo en los bosques tropicales") 
    }
    

    
}


