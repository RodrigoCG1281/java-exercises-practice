import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Crea un programa que simule un juego de adivinanzas.
        El programa debe generar un número aleatorio entre 0 y 100,
        y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos.
        En cada intento, el programa debe informar si el número ingresado por el usuario
        es mayor o menor que el número generado.
         */

        int numero_obtenido = new Random().nextInt(100);
        int numero_intento;
        Scanner lectura = new Scanner(System.in);
        int intentos = 0;
        System.out.println(numero_obtenido);



        while(intentos < 5){
            System.out.println("Ingresa un numero del 1 al 100: ");
            numero_intento = lectura.nextInt();
            intentos++;

            if(numero_intento == numero_obtenido){
                System.out.println("Felicidades! ACERTASTE");
                break;
            }
            else if(numero_intento > numero_obtenido){
                System.out.println("El numero que ingresaste es mayor al numero objetivo");
            }else{
                System.out.println("El numero que ingresaste es menor al numero objetivo");
            }

        }
        if(intentos == 5){
            System.out.println("Llegaste al limite de los 5 intentos :(, el numero era: "+numero_obtenido);
        }





    }
}