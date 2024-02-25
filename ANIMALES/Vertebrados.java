abstract public class Vertebrados extends Animales { 

    //Supongamos que son atributos generales de la clase
    private int cantidadVertebras;
    private int velocidad;


//Constructor de la clase vertebrados
    public Vertebrados () {
    System.out.println("constuctor de un vertebrado");
 }

//Metodos abstractos de la clase vertebrados (aun no se pueden definir)
    abstract public void alimentarse ();
    abstract public void Habitar ();

} 
//Atributos comunes para una clase de animales herbívoros:  Tipo de alimentación:
//Ramoneo: Consumen hojas, brotes y ramas de plantas leñosas.
//Pastoreo: Consumen hierbas y plantas de bajo crecimiento.
//Frutos y semillas: Consumen principalmente frutos y semillas de plantas.