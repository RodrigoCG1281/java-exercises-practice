public class Main {
    public static void main(String[] args) {
        String saludo = "Hola, mi nombre es ";
        String nombre = "Alicia ";
        String continuacion = "y mi edad es ";
        int edad = 17;
        System.out.println(saludo + nombre + continuacion + edad);



    /*Conversion de Consejo: La fórmula para convertir temperaturas
     de grados Celsius a Fahrenheit es: (temperatura * 1.8) + 32.
    */

        int celsius = 45;
        double farenheit;

        farenheit = (celsius * 1.8) + 32;

        System.out.println("La conversion de: "+ celsius + " grados celsius a grados ferenheit es: " + farenheit);

    }
}