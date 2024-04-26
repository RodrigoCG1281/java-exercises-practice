import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("***********************************");
        String nombre = "Rodrigo Stark";
        String tipo_cuenta = "Black Card";
        double saldo =  500000;
        int opc = 0;
        double retiro = 0;
        double deposito = 0;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipo_cuenta);
        System.out.println("Saldo disponible: " + saldo);

        System.out.println("***********************************");




        while(opc != 9){
            System.out.println("** Escriba el numero de la opcion deseada **");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");

            opc = lectura.nextInt();

            if(opc == 1){
                System.out.println("El saldo actualizado es: " + saldo);
            }
            else if(opc == 2){
                System.out.println("Ingrese el monto a retirar: ");
                retiro = lectura.nextDouble();

                if(retiro > saldo){
                    System.out.println("SALDO INSUFICIENTE");
                }else{
                    saldo = saldo - retiro;
                }
            }
            else if(opc == 3){
                System.out.println("Ingrese el monto a depositar: ");
                deposito = lectura.nextDouble();
                saldo = saldo + deposito;
            }else{
                System.out.println("OPCION NO VALIDA");
            }
        }

    }
}