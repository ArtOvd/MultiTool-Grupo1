import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=================================");
            System.out.println("||      MENÚ DE APLICACIÓN     ||");
            System.out.println("=================================");
            System.out.println("1 - Gestor de números.");
            System.out.println("2 - Conversor multitipo.");
            System.out.println("3 - Analizador de texto.");
            System.out.println("4 - Gestión de tareas.");
            System.out.println("5 - Salir");
            System.out.print("Tu opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:
                    break;

                case 4:
                    GestionTareas.GestorDeTareas();
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestra aplicación!");
                    break;
                default:
                    System.out.println("Opción no valida. Elige otra.");
            }
        } while (opcion != 5);
    }

}
