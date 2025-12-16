import java.sql.SQLOutput;
import java.util.Scanner;

public class ConversosMultitipo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    conversormultitipo();
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
        int opcion;

        while (true){
            System.out.println( ">\n CONVERSOR DE DATOS");
            System.out.println("> 1. Celsius a Farenheit");
            System.out.println("> 2. Metros a Pies");
            System.out.println("> 3. Kg a Libras");
            System.out.println("> 0. Salir");
            System.out.println("----->>>> elige una opción: ");

            if(sc.hasNextInt()){
                opcion = sc.nextInt();
                sc.nextLine();
                return opcion;
            }else{
                System.out.println(">>>> Error: solo se aceptan números <<<<");
            }
        }
    }

    static void conversorCelsiusFarenheit(){
        double celsius = leerDoubleSeguro("-> Introduce grados Celsius: ");
        double farenheit = (celsius * 9 / 5) +32;
        System.out.println(celsius + " C = " +farenheit + " F");
    }

    static void conversorMetrosPies(){
        double metros = leerDoubleSeguro("-> introduce metros: ");
        double pies = metros * 3.28084;
        System.out.println(metros + " metros = " + pies + " pies");
    }

    static void conversorKgLibras(){
        double kg = leerDoubleSeguro("-> Introduce kilos: ");
        double libras = kg * 2.20462;
        System.out.println(kg + "kg = " + libras +  " libras");
    }

    //metodo para que solo acepte numeros
    static double leerDoubleSeguro(String mensaje) {

    }
}
