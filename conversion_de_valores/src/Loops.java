import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        System.out.println("Ingrese 3 evaluaciones de sus amigos: ");


        for (int i = 1; i <= 3; i++) {
            System.out.println("nota " + i );
            nota = lectura.nextDouble();
            System.out.println("La nota " + i +  " es: " + nota);
            mediaEvaluaciones = nota + mediaEvaluaciones;
        }
        mediaEvaluaciones = mediaEvaluaciones/3;

        System.out.println("La media es: " + mediaEvaluaciones);


    }
}
