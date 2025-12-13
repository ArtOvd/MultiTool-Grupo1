import java.util.Scanner;

public class GestionTareas {
    static Scanner sc = new Scanner(System.in);
    static String[] tareas = new String[15];
    static int index = 3;
    public static void main(String[] args) {

    }

    static void imprimirMenu() {
        System.out.println("1. Añadir tarea");
        System.out.println("2. Listar tareas");
        System.out.println("3. Buscar palabra");
        System.out.println("0. Volver");
    }

    static void addTarea() {
        boolean valido = false;
        String tarea = "";
        do {
            tarea = "";
            System.out.print("Indica el nombre de la tarea: ");
            tarea = sc.nextLine().trim().toLowerCase();
            if (tarea.isEmpty()) {
                System.out.println("No se puede añadir una tarea sin nombre.");
                break;
            } else if (tarea.length() < 10) {
                System.out.println("El nombre de la tarea tiene que contener más de 10 caracteres.");
                break;
            }
            for (int i = 0; i < index; i++) {
                if (tareas[i].equals(tarea)) {
                    System.out.println("Esta tarea ya existe");
                    break;
                }
            }
            valido = true;
        } while (false);
            if (valido) {
                tareas[index] = tarea;
                System.out.println("Tarea añadida correctamente.");
            }
    }

    static void listarTareas() {
        System.out.println("=================");
        System.out.println("LISTA DE TAREAS");
        System.out.println("=================");
        for (int i = 0; i < index; i++) {
            System.out.println("Tarea " + (i + 1) + ": " +  tareas[i]);
        }
    }

    static void buscarTareas() {
        boolean encontrado = false;
        System.out.println("====================");
        System.out.println("BÚSQUEDA DE TAREAS");
        System.out.println("====================");
        System.out.print("Indica el nombre de la tarea: ");
        String entrada = sc.nextLine().trim().toLowerCase();
        if (entrada.isEmpty()) {
            System.out.println("No se admite entrada vacía.");
        } else {
            System.out.println("Tareas encontradas:");
            for (int i = 0; i < index; i++) {
                if (tareas[i].equals(entrada)) {
                    encontrado = true;
                    System.out.println(tareas[i]);
                    break;
                } else if (tareas[i].startsWith(entrada) || tareas[i].contains(entrada)) {
                    encontrado = true;
                    System.out.println(tareas[i]);
                }
            }
            if (!encontrado) {
                System.out.println("No hay tareas con este nombre.");
            }
        }

    }

}
