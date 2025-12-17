
import java.util.Scanner;

public class ConversosMultitipo {
    static Scanner sc = new Scanner(System.in);

    public static void conversorMultitipo() {
        int opcion;
        do{
            opcion = MostrarMenuYLeerOpcion();
            switch (opcion){
                case 1:
                    conversorCelsiusFarenheit();
                    break;
                case 2:
                    conversorMetrosPies();
                    break;
                case 3:
                    conversorKgLibras();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no valida. Elige otra");
            }
        }while(opcion !=0);
    }

    static int MostrarMenuYLeerOpcion(){
        int opcion;

        while (true){
            System.out.println("=====================================");
            System.out.println("||    MENÚ / CONVERSOR DE DATOS    ||");
            System.out.println("=====================================");
            System.out.println("1. Celsius a Farenheit");
            System.out.println("2. Metros a Pies");
            System.out.println("3. Kg a Libras");
            System.out.println("0. Salir");
            System.out.println("=====================================");
            System.out.print("Tu opción: ");

            if(sc.hasNextInt()){
                opcion = sc.nextInt();
                sc.nextLine(); //clean buffer
                return opcion;
            }else{
                System.out.println("Error. Solo se aceptan números.");
            }
        }
    }

    static void conversorCelsiusFarenheit(){
        double celsius = leerDoubleSeguro("Introduce grados Celsius: ");
        double farenheit = (celsius * 9 / 5) +32;
        System.out.println(celsius + " C = " +farenheit + " F");
    }

    static void conversorMetrosPies(){
        double metros = leerDoubleSeguro("Introduce metros: ");
        double pies = metros * 3.28084;
        System.out.println(metros + " metros = " + pies + " pies");
    }

    static void conversorKgLibras(){
        double kg = leerDoubleSeguro("Introduce kilos: ");
        double libras = kg * 2.20462;
        System.out.println(kg + "kg = " + libras +  " libras");
    }

    //metodo para que solo acepte numeros (COMPLETADO)
    static double leerDoubleSeguro(String mensaje) {
        double numero;

        while (true){
            System.out.println(mensaje);
        if(sc.hasNextDouble()){
            numero = sc.nextDouble();
            sc.nextLine();
            return numero;
        }else{
            System.out.println( "Error. Solo se permiten numeros");
            sc.nextLine();
            }
        }
    }
}
