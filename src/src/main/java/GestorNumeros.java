import java.util.Scanner;

public class GestorNumeros {
    static int[] arrayNums = new int[20];
    static int subMenu;

    public static void gestorNumerosMenu(){
        int count = 0;
        do {
            infoMenu();
            subMenu = checkInt();

            switch(subMenu){
                //Añadir un número a la lista
                case 1:
                //Listar números
                case 2:
                //Ver mínimo y máximo
                case 3:
                //Buscar números
                case 4:
                //Termina proceso
                case 0:
            }
        }
        while(subMenu != 5);
    }

    public static void infoMenu(){
        System.out.println();
        System.out.println("============= LISTA =============");
        System.out.println();
        System.out.println("1 - Añadir un número a la lista");
        System.out.println("2 - Listar números");
        System.out.println("3 - Ver mínimo y máximo");
        System.out.println("4 - Buscar números");
        System.out.println("5 - Salir");
        System.out.println();
    }

    //SCANNER QUE SE ASEGURA DE QUE SE ESTÉ INTRODUCIENDO UN INT
    public static int checkInt(){
        Scanner sc = new Scanner(System.in);
        int isInt = 0;
        boolean isValid = false;
        while (!isValid){
            if(sc.hasNextInt()){
                isInt = sc.nextInt();
                isValid = true;
            }
            else{
                sc.nextLine();
            }
        }
        return isInt;
    }

}
