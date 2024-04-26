import java.util.Scanner;

public class lectura {
    public static void main(String[] args) {
        //creacion de una lectura de datos sobre animes

        String nombre_anime;
        int fechaDeLanzamiento;
        double nota;
        int cantidadCapitulos;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su anime favorito: ");
        nombre_anime = lector.nextLine();

        System.out.println("Ingrese la fecha de lanzamiento: ");
        fechaDeLanzamiento = lector.nextInt();

        System.out.println("Ingrese la nota de su anime: ");
        nota = lector.nextDouble();

        System.out.println("Ingrese la cantidad de episodios: ");
        cantidadCapitulos = lector.nextInt();

        if(cantidadCapitulos >= 500){
            System.out.println("Es un anime god");
        }else{
            System.out.println("Niofi con ese anime te dire mi rey");
        }

        if(nombre_anime.equals("Dragon Ball Z") || nombre_anime.equals("One Piece")){
            System.out.println("EXCELENTE MI REY");
        }


    }
}
