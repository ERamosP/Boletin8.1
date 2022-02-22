package Ejercicio3;


import java.util.Scanner;

public class MenuVuelos {

    static Scanner sc=new Scanner(System.in);

    public static String leerDatos(){

        return sc.next();
    }

    public static void pintarMenuPpal(){

        System.out.println(System.lineSeparator()+"""
                ----------------------- Bienvenido a nuestra agencia de viajes Ramos S.L. -----------------------
                -------------------------------------------------------------------------------------------------
                [1] ¿Desea realizar una reserva?
                [0] Salir
                -------------------------------------------------------------------------------------------------""");

    }

    public static void pintarMenuOpciones(){
        System.out.println(System.lineSeparator()+"""
                **************************** ¿Que desea hacer? ****************************
                (1) Reservar en la zona de no fumadores
                (2) Reservar en la zona de fumadores
                (0) Salir
                ***************************************************************************""");
    }

    public static void mostrarMenu(){

        boolean salirMenuPpal=false, salirOpcion;

        do {
                salirOpcion=false;
                pintarMenuPpal();
                String opcionPpal= leerDatos();

            switch (opcionPpal){
                case "1":
                   pintarMenuOpciones();
                   String opcionSecundario=leerDatos();
                   switch (opcionSecundario){
                       case "1":
                          Vuelos.asientosNoFumadores(Vuelos.sitiosLibres);
                           break;
                       case "2":
                           Vuelos.asientoFumador(Vuelos.sitiosLibres);
                           break;
                       case "0":
                           System.out.println("");
                           break;
                       default:
                           System.out.println("Opcion incorrecta intentelo de nuevo o salga al Menu Principal");
                   }
                    break;
                case "0":
                    salirMenuPpal=true;

                    break;

                default:
                    System.out.println("Opcion incorrecta intentelo de nuevo o pulse 0 para salir");
            }

        }while (!salirMenuPpal);
        Vuelos.impirimirVuelo(Vuelos.sitiosLibres);
    }

}
