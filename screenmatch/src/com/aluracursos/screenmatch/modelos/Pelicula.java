package com.aluracursos.screenmatch.modelos;

//para no perder mis commmits diarios
public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    //agrego private para que un tercero no pueda acceder a estas variables y de esa manera brindar seguridad
    private double sumaDeEvaluaciones = 0;
    private int totalDeIteraciones = 0;

    public void setNombre(String nombre) {
        this.nombre = nombre; //this.nombre hace referencia al atributo de nuestra clase pelicula
                              // nombre como tal hace referencia al valor que recibimos del metodo setNombre
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDeLasIteraciones (){
        return totalDeIteraciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void fichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("La fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("La duracion es de: " + duracionEnMinutos + " minutos");
    }

    public void evalua(double nota){
        sumaDeEvaluaciones = sumaDeEvaluaciones + nota;
        totalDeIteraciones++;

    }

    public void calcular_media(){
        System.out.println("La media es: " + sumaDeEvaluaciones / totalDeIteraciones);
    }
    //Hago uso de void cuando no retorno un valor que usare en mi clase principal
    //Y hago uso de otro tipo cuando si usare ese valor despues




}
