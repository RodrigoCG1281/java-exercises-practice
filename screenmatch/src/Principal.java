public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;
        miPelicula.fichaTecnica();
        miPelicula.evalua(7);
        miPelicula.evalua(8);
        miPelicula.evalua(9);
        miPelicula.evalua(10);

        System.out.println(miPelicula.sumaDeEvaluaciones);
        miPelicula.calcular_media();

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 2014;
        otraPelicula.duracionEnMinutos = 180;
        //otraPelicula.fichaTecnica();
    }

}
