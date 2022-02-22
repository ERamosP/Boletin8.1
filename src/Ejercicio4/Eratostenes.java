package Ejercicio4;


import java.util.Scanner;

public class Eratostenes {

    static Scanner sc=new Scanner(System.in);



    public static int pedirNumero(){
        System.out.println("Introduzca la cantidad de numeros que desee");
       return sc.nextInt();
    }

    public static int leerNumero(){
        return sc.nextInt();
    }

    public static void crearSecuencia(int[] array){

        int j=2;
        for (int i=0;i<array.length;i++){
            array[i]=j;
            j++;
            System.out.print(array[i] +", ");
        }
    }

    public static int [] divirEntreDos(int [] array){

        int contador=0;
        for (int i = 0; i < array.length; i++) {
             if (array[i]%2==0){
                  contador++;
                 System.out.print(array[i]+", ");
            }
        }
            int [] array2=new int[contador];
        for (int i = 0; i < array2.length; i++) {
            if (array[i]%2==0){
                array[i]=array[i]+1;
                System.out.print(array[i]+", ");
            }
        }

        return array;
    }

    public static void divirEntreTres(int [] array){

        for (int i = 0; i < array.length; i++) {
            if (array[i]){
                array[i]=array[i]+1;
                System.out.print(array[i]+", ");
            }
        }
    }

}
