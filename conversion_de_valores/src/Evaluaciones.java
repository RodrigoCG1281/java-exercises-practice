import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double contador = 0;

        while (nota != -1){
            System.out.println("Escribe la nota para la pelicula The Lion King");
            nota = lectura.nextDouble();
            mediaEvaluaciones = nota + mediaEvaluaciones;
            contador = contador + 1;

            if(nota == -1){
                mediaEvaluaciones = mediaEvaluaciones + 1;
                contador = contador - 1;
            }
        }

        System.out.println("La media de evaluaciones de "+ contador +" evaluaciones es: " + mediaEvaluaciones/contador );

    }
}
