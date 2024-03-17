
class Singleton {
    private Singleton() {
        //hacemos que el constructor sea privado.
    }

//creo una variable estatica donde se esta haciendo el patron
    private static Singleton _instance; 

    static Singleton getInstance(){
        if (_instance == null) {
            _instance == new Singleton();

        }
        return _instante;
    }
}

// el if me garantiza que si no hay una instancia de Singleton pues la creo y es la que siempre se va a devolver en todas las llamadas que tengamos en cualquier programa 