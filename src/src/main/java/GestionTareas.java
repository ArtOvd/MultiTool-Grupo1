import java.util.Scanner;

public class GestionTareas {
    static Scanner sc = new Scanner(System.in);
    static String[] tareas = new String[15];
    static int index = 0;

    public static void main(String[] args) {
        int opcion;
        do {
            imprimirMenu();
            System.out.print("Tu opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    addTarea();
                    break;
                case 2:
                    listarTareas();
                    break;
                case 3:
                    buscarTareas();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcíon no valida. Elige otra.");
            }
        } while (opcion != 0);
    }

    static void imprimirMenu() {
        System.out.println("=====================");
        System.out.println("||      MENÚ       ||");
        System.out.println("=====================");
        System.out.println("1. Añadir tarea");
        System.out.println("2. Listar tareas");
        System.out.println("3. Buscar palabra");
        System.out.println("0. Volver");
        System.out.println("=====================");
    }

    static void addTarea() {
        System.out.println("===================");
        System.out.println("AÑADIR UNA TAREA");
        System.out.println("===================");
        if (index >= 15) {
            System.out.println("No se pueden añadir más tareas. Límite alcanzado.");
            return;
        }
        boolean valido = false;
        String tarea = "";
        while (!valido) {
            System.out.print("Indica el nombre de la tarea: ");
            tarea = sc.nextLine().trim().toLowerCase();
            if (tarea.isEmpty()) {
                System.out.println("No se puede añadir una tarea sin nombre.");
            } else if (tarea.length() < 10) {
                System.out.println("El nombre de la tarea tiene que contener más de 10 caracteres.");
            } else {
                boolean duplicada = false;
                for (int i = 0; i < index; i++) {
                    if (tareas[i].equals(tarea)) {
                        System.out.println("Esta tarea ya existe");
                        duplicada = true;
                        break;
                    }
                }
                if (!duplicada) {
                    valido = true;
                }
            }
        }
        tareas[index] = tarea;
        System.out.println("Tarea añadida correctamente.");
        System.out.println("===================");
        index++;
    }

    static void listarTareas() {
        if (index != 0) {
            System.out.println("=================");
            System.out.println("LISTA DE TAREAS");
            System.out.println("=================");
            for (int i = 0; i < index; i++) {
                System.out.println("Tarea " + (i + 1) + ": " + tareas[i]);
            }
            System.out.println("=================");
        } else {
            System.out.println("Todavía no hay tareas para mostrar.");
        }
    }

    static void buscarTareas() {
        if (index != 0) {
            boolean encontrado = false;
            System.out.println("====================");
            System.out.println("BÚSQUEDA DE TAREAS");
            System.out.println("====================");
            System.out.print("Indica el nombre de la tarea: ");
            String entrada = sc.nextLine().trim().toLowerCase();
            if (entrada.isEmpty()) {
                System.out.println("No se admite entrada vacía.");
            } else {
                System.out.println("====================");
                System.out.println("TAREAS ENCONTRADAS:");
                System.out.println("====================");
                for (int i = 0; i < index; i++) {
                    if (tareas[i].equals(entrada) || tareas[i].startsWith(entrada) || tareas[i].contains(entrada)) {
                        encontrado = true;
                        System.out.println((i + 1) + " - " + tareas[i]);
                    }
                }
                if (!encontrado) {
                    System.out.println("No hay tareas con este nombre.");
                }
            }
            System.out.println("====================");
        } else {
            System.out.println("Todavía no hay ningúna tarea para buscar.");
        }
    }
}