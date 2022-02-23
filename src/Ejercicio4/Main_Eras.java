package Ejercicio4;

import java.util.Scanner;

public class Main_Eras {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduzca el numero de elementos que desea introducir en el array");
        int numero=sc.nextInt();

       int [] erastotenes= Eratostenes.montarArray(numero);
        Eratostenes.recorrerArray(numero,erastotenes);
        Eratostenes.imprimirArray(erastotenes);
    }
}
