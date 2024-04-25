public class Decisiones {
    public static void main(String[] args) {
        //Datos de la pelicula -- Tipos de dato primitivos
        int fechaDeLanzamiento = 2021;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoplan = "plus";

        if(fechaDeLanzamiento >= 2022){
           System.out.println("Peliculas mas populares");
        }else{
            System.out.println("Peliculas retro que aun vale la pena ver");
        }

        //para comentar un bloque de codigo, basta con sombrearlo y hacer Ctrl + /

        if(incluidoEnElPlan && tipoplan == "plus"){
            // con "||" basta una condicion que sea verdadera para que se ejecute el codigo
            // con "&&" las dos condiciones tienen que ser verdaderas para que se ejecute el codigo
            //tipoplan.equals("plus"), tambien hace lo mismo
            System.out.println("Esta dentro del plan");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
