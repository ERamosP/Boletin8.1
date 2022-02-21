package Ejercicio3;

public class Vuelos {


    /*
     El programa debe contemplar
zona de fumadores y no fumadores. Los no fumadores ocuparan los asientos 1-16 y los fumadores
el resto.
     */
    private final int ASIENTOS =20;
    int[] asientos=new int[ASIENTOS];

    public int getASIENTOS() {
        return ASIENTOS;
    }

    public Vuelos() {
    }

    public static int [] pasaje(int[] asientos){

        boolean ocupado=true;
        for (int i=0;i<asientos.length;i++){

            if (ocupado!=true){
                asientos[i]=0;
            }else {
                asientos[i]=1;
            }
        }
        return asientos;
    }

    public static int asientoFumador(){

        System.out.println("¿Desea elegir un asiento en no fumador?");
        String respuesta=MenuVuelos.leerDatos();
        if (respuesta=='s')
        int contFumador;


            return  contFumador;
        }

    }



