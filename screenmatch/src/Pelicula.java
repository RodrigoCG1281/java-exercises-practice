public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    //agrego private para que un tercero no pueda acceder a estas variables y de esa manera brindar seguridad
    private double sumaDeEvaluaciones = 0;
    private int totalDeIteraciones = 0;


    void fichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("La fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("La duracion es de: " + duracionEnMinutos + " minutos");
    }

    void evalua(double nota){
        sumaDeEvaluaciones = sumaDeEvaluaciones + nota;
        totalDeIteraciones++;

    }

    void calcular_media(){
        System.out.println("La media es: " + sumaDeEvaluaciones / totalDeIteraciones);
    }
    //Hago uso de void cuando no retorno un valor que usare en mi clase principal
    //Y hago uso de otro tipo cuando si usare ese valor despues




}
