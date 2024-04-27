import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);

        miPelicula.fichaTecnica();
        miPelicula.evalua(7);
        miPelicula.evalua(8);
        miPelicula.evalua(9);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalDeLasIteraciones());
        miPelicula.calcular_media();


//        Pelicula otraPelicula = new Pelicula();
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 2014;
//        otraPelicula.duracionEnMinutos = 180;
//        //otraPelicula.fichaTecnica();
    }

}
