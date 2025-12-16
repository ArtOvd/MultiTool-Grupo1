import java.util.Scanner;

public class AnalizadorTexto {
    static void AnalizadorDeTexto() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            MenuAnalizadorTexto();
            opcion = ElegirOpcion(sc);
            FuncionalidadDelMenu(opcion, sc);
        } while (opcion != 0);
    }

    static void MenuAnalizadorTexto() {
        System.out.println("======================================");
        System.out.println("||     MENU / ANALIZADOR DE TEXTO   || ");
        System.out.println("======================================");
        System.out.println("1. Contar vocales");
        System.out.println("2. Contar palabras");
        System.out.println("3. Palabra más larga");
        System.out.println("0. Volver");
        System.out.println("======================================");
    }

    static int ElegirOpcion(Scanner sc) {
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    static String PedirTexto(Scanner sc) {
        String texto = "";
        do {
            System.out.print("Introduce el texto el que quieres analizar: ");
            texto = sc.nextLine();
        } while (!ValidacionTexto(texto));
        return texto;
    }

    static void FuncionalidadDelMenu(int opcion, Scanner sc) {
        switch (opcion) {
            case 1:
                ContarVocales(sc);
                break;
            case 2:
                ContarPalabras(sc);
                break;
            case 3:
                PalabraMasLarga(sc);
                break;
            case 0:
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }


    static void ContarVocales(Scanner sc) {
        System.out.println("======================================");
        System.out.println("||       CONTADOR DE VOCALES        ||");
        System.out.println("======================================");
        System.out.println();
        String texto = PedirTexto(sc).toLowerCase();
        int contador = 0;
        for (int i = 0; i <= texto.length() - 1; i++) {
            switch (texto.charAt(i)) {
                case 'a', 'o', 'e', 'i', 'u', 'á', 'ó', 'é', 'ú', 'í':
                    contador++;
                    break;
            }

        }
        if (contador == 0) {
            System.out.println("No hay vocales en el texto introducido");
        } else System.out.println("En el texto introducido hay " + contador + " vocales");
    }

    static void ContarPalabras(Scanner sc) {
        System.out.println("======================================");
        System.out.println("||       CONTADOR DE PALABRAS        ||");
        System.out.println("======================================");
        System.out.println();
        String texto = PedirTexto(sc);
        texto = ReemplacarCaracteres(texto);

        texto = texto.trim();
        boolean validacion = ValidacionTexto(texto);
        if (validacion) {
            String[] palabras = texto.split("\\s+");
            int cantidad = palabras.length;
            System.out.println("El cantidad de palabras en el texto: " + cantidad);
        } else {
            System.out.println("No puede estar vacio");
        }
    }

    static void PalabraMasLarga(Scanner sc) {
        System.out.println("======================================");
        System.out.println("||        PALABRA MÁS LARGA         ||");
        System.out.println("======================================");
        System.out.println();
        String texto = PedirTexto(sc).trim();

        texto = ReemplacarCaracteres(texto);

        texto = texto.trim();

        String[] palabras = texto.split("\\s+");

        String MasLarga = palabras[0];
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > MasLarga.length()) {
                MasLarga = palabras[i];
            }
        }
        System.out.println("La palabra mas larga es: " + MasLarga);
    }

    static boolean ValidacionTexto(String texto) {
        if (texto.isEmpty()) {
            System.out.println("El texto no puede estar vacio");
            return false;
        }
        return true;
    }

    static String ReemplacarCaracteres(String texto) {
        texto = texto.replace('.', ' ')
              .replace(',', ' ')
              .replace('?', ' ')
              .replace('!', ' ')
              .replace(':', ' ')
              .replace(';', ' ')
              .replace('-', ' ');

        return texto;
    }

}
