import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula");
        String pelicula = teclado.nextLine(); //usamos el .nextLine cuando se trata de un texto

        System.out.println("Ahora escriba la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt(); //usamos el .nextInt porque se trata de un entero

        System.out.println("Por ultimo dinos que nota le das a la Pelicula");
        double nota = teclado.nextDouble(); //usamos el .nextDouble porque se trata de un double(flotante)

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);


    }
}
