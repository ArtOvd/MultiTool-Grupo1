import java.util.Scanner;

public class ConversorMultitipo {

    public static void conversorMultitipo() {

        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
                opcion = mostrarMenuYLeerOpcion();
                switch (opcion) {
                    case 1:
                        ConvertorCelsiusFarenheit();
                        break;
                    case 2:
                        convertorMetrosPies();
                        break;

                    case 3:
                        convertorKgLibras();
                        break;


                    case 0:
                        System.out.println("Volver");
                        break;
                    default:
                        System.out.println("Opcion no valida ");
                }

                System.out.println("\nPulsa ENTER para continuar...");
                sc.nextLine();

            } while (opcion != 0);

        }


        static int mostrarMenuYLeerOpcion () {
            System.out.println("\n CONVERTOR DE DATOS");
            System.out.println(" 1. CELSIUS A FARENHEIT ");
            System.out.println(" 2. METROS A PIES ");
            System.out.println(" 3.KG A LIBRAS");
            ;
            return 0;
        }
        static double ConvertorCelsiusFarenheit () {


            return 0;
        }
        static double convertorMetrosPies () {

            return 0;
        }
        static double convertorKgLibras () {

            return 0;
        }

    }

}
