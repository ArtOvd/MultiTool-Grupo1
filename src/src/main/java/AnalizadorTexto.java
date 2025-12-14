import java.util.Scanner;

public class AnalizadorTexto {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
        do {
            MenuAnalizadorTexto();
            opcion = ElegirOpcion(sc);
            FuncionalidadDelMenu(opcion, sc);
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
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    static String PedirTexto(Scanner sc) {
        String texto = "";
        System.out.print("Introduce el texto el que quieres analizar: ");
        texto = sc.nextLine();
        return texto;
    }

    static void FuncionalidadDelMenu(int opcion,  Scanner sc) {
        switch (opcion) {
            case 1:
                ContarVocales(sc);
                break;
            case 2:
                ContarPalabras(sc);
                break;
            default:
                System.out.println("Opcion no permetida");
        }
    }



    static void ContarVocales(Scanner sc) {
        String texto = PedirTexto(sc).toLowerCase();
        int contador = 0;
        for (int i = 0; i <= texto.length() - 1; i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay vocales en el texto introducido");
        }else System.out.println("En el texto introducido hay " + contador + " vocales");
    }

    static void ContarPalabras(Scanner sc) {
        String texto = PedirTexto(sc).toLowerCase();
        texto = texto.replace('.', ' ')
                .replace(',', ' ')
                .replace('?', ' ')
                .replace('!', ' ')
                .replace(':', ' ')
                .replace(';', ' ')
                .replace('-', ' ');

            texto = texto.trim();

            String[] palabras = texto.split("\\s+");

            int cantidad =  palabras.length;
        System.out.println("El cantidad de palabras en el texto: " + cantidad);
}
}
