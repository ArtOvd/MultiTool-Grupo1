import java.util.Scanner;

public class ConversosMultitipo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    }
    //metodo con el switch el cual es el menu/seleccionador de la aplicacion

    public static void conversormultitipo(){

        int opcion;
        do{
            opcion = MostrarMenuYleeropcion();
            switch (opcion){
                case 1:
                    conversorCelsiusFarenheit();
                    break;
                case 2:;
                    conversorMetrosPies();
                    break;
                case 3:
                    conversorKgLibras();
                    break;
                case 0:
                    System.out.println("---->>>  Saliedo...");
                    break;
                default:
                    System.out.println("---- Opcion no válida ----");
            }

            if (opcion != 0){
                System.out.println("\n-----Pulsa ENTER para continuar-----");
                sc.nextLine();
            }

        }while(opcion !=0);


    }
    static int MostrarMenuYleeropcion(){

    }

    static void conversorCelsiusFarenheit(){

    }

    static void conversorKgLibras(){

    }

    static void conversorMetrosPies(){

    }

    //metodo para que solo acepte numeros
    static double leerDoubleSeguro(String mensaje) {

    }
}
