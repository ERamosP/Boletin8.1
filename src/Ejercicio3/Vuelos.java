package Ejercicio3;
import java.util.Arrays;
public class Vuelos {

    /*
     El programa debe contemplar
zona de fumadores y no fumadores. Los no fumadores ocuparan los asientos 1-16 y los fumadores
el resto.
     */

    static final int[] sitiosLibres = new int[20];
    static int contNoFumador = 16;
    static int contFumador = 4;


    public static void asientosNoFumadores(int[] asientos) {

        int ocupados = nAsientos();

        if (contNoFumador > 0) {
            contNoFumador -= ocupados;
            for (int i = 0; i < ocupados; i++) {
                asientos[i] = 1;

            }

        } else {
           System.out.println(System.lineSeparator()+"No existen asientos libres en la zona de no fumadores");
            reservarOtraZona(asientos);
        }


    }


    public static int nAsientos() {
        System.out.println("¿Cuantos asientos quiere reservar?");
        int numero = MenuVuelos.sc.nextInt();
        return numero;
    }

    public static void asientoFumador(int[] asientos) {

        int ocupados = nAsientos();

        if (contFumador > 0) {
            contFumador -= ocupados;
            for (int i = 0; i < ocupados; i++) {
                asientos[i] = 1;

            }

        } else {
            System.out.println(System.lineSeparator() + "No existen asientos libres en la zona de fumadores");
            reservarOtraZona(asientos);

        }
 }

    public static boolean preguntarCAmbioAsiento() {

        boolean opcion;
        System.out.println("¿Desea elegir un pasaje en la otra zona?");
        String respuesta=MenuVuelos.leerDatos();
        if (respuesta != "si") {
            System.out.println("Espere al proximo vuelo para poder viajar");
            opcion=false;
        } else {
            opcion=true;
        }
        return opcion;
    }

    public static void reservarOtraZona(int[] asientos) {
        boolean respuesta = preguntarCAmbioAsiento();
        int ocupados = nAsientos();
        if (respuesta == true && contFumador == 4 && contNoFumador < 16) {
            contNoFumador -= ocupados;
            for (int i = 0; i < ocupados; i++) {
                asientos[i] = 1;

            }
        }
        else if (respuesta == true && contFumador < 4 && contNoFumador == 16) {
            contFumador-=ocupados;
            for (int i = 0; i < ocupados; i++) {
                asientos[i] = 1;

            }

        }
    }

    public static void impirimirVuelo(int [] asientos ){
        System.out.println(Arrays.toString(asientos));
    }
}
