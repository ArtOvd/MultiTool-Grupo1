import java.util.Scanner;

public class AnalizadorTexto {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
        do {
            MenuAnalizadorTexto();
            opcion = ElegirOpcion(sc);
        }while (opcion != 0 );
    }


    static void MenuAnalizadorTexto() {
        System.out.println("======================================");
        System.out.println("      MENU / ANALIZADOR DE TEXTO      ");
        System.out.println("======================================");
        System.out.println();
        System.out.println("1. Contar vocales");
        System.out.println("2. Contar palabras");
        System.out.println("3. Palabra más larga");
        System.out.println("0. Volver");
    }

    static int ElegirOpcion(Scanner sc) {
        System.out.println();
        System.out.print("Elige opción: ");
        return sc.nextInt();
    }



}
