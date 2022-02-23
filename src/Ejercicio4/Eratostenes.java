package Ejercicio4;


import java.util.Scanner;

public class Eratostenes {

    //Metodo para montar array
    public static int [] montarArray(int numero){

        int[] criba=new int[numero];

        int num=3,i=0;

        while (num<numero){
            criba[i]=num;
            i++;
            num=num+2;
        }
        return criba;
    }

    //Metodo para recorrer array

    public static void recorrerArray(int numero, int[] criba){
        int limite=(int) Math.sqrt(numero);
        int i=0;
        int j=criba[i];
        while (criba[i]<limite){
            do {
                criba[j]=0;
                j=criba[i]+j;

            }while (j<(numero-1));
        i++;
        j=criba[i];
        }

    }

    public static void imprimirArray(int[] criba){
        for (int i=0;i< criba.length;i++){
            if (criba[i]!=0){
                System.out.print(criba[i]+ ", ");
            }
        }
    }












}
