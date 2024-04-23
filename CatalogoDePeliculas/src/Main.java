public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        //Datos de la pelicula -- Tipos de dato primitivos
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        //String es una clase que contiene distintos metodos
        String sinopsis = "Matrix es una paradoja, una pelicula donde actua Keanu Reaves. Fue lanzada en:" + fechaDeLanzamiento +
                ", la nota de la pelicula es de: " + notaDeLaPelicula;

        System.out.println(sinopsis);

        //Concatenar strings

        String nombre = "Rodrigo Bernardo ";
        String apellidos = "Condori Gutierrez";
        int edad = 23;

        String texto = """
                 y quiero aprender Java para luego crear miniproyectos y en cierto tiempo decir: 
                """;
        String objetivo = """
                "Soy muy gozu en Java xd"
                """;
        System.out.println(String.format("Mi nombre es: %s %s, tengo %d anios", nombre, apellidos, edad) + texto + objetivo);


    }
}