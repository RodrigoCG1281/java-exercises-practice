public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeEvaluaciones = 0;
    int totalDeIteraciones = 0;


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




}
