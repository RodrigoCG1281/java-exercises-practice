public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        System.out.println("Mi pelicula es: " + miPelicula.nombre);
        System.out.println("Fue lanzada en: "+ miPelicula.fechaDeLanzamiento);
        System.out.println("Y tiene una duracion de: " + miPelicula.duracionEnMinutos);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 2014;
        otraPelicula.duracionEnMinutos = 180;

        System.out.println("Mi otra pelicula es: " + otraPelicula.nombre);
        System.out.println("Fue lanzada en: "+ otraPelicula.fechaDeLanzamiento);
        System.out.println("Y tiene una duracion de: " + otraPelicula.duracionEnMinutos);



    }
}
