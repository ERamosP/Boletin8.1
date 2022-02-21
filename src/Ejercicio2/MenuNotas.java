package Ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class MenuNotas {

    static Scanner sc=new Scanner(System.in);

    public static String leerOpcion(){

        return sc.next();
    }

    public static int numeroElementos(){
        System.out.println("¿Cuantos alumnos tiene su clase?");
        return sc.nextInt();
    }

    public static void crearMenu(){

        System.out.println("""
                ------------------    QUE OPCION DESEA REALIZAR    ------------------
                ********************************************************************************
                [1] Calcular la nota media
                [2] Conocer la nota mas alta
                [3] Conocer la nota mas baja
                [4] Cuantos alumnos están por encima de la media
                [5] Cuantos alumnos están por debajo de la media
                [0] Salir
                --------------------------------------------------------------------------------""");
    }

    public static void pintarMenu(){

        String opcion;
        boolean salirMenu=false;
        int [] notas=new int[Notas.totalAlumnos];
        Notas.crearRandom(notas);
        do {
            crearMenu();
            opcion= leerOpcion();

            switch (opcion){
                case "1":

                  System.out.println("La media de las notas ess: " + Notas.notaMedia(notas));
                    break;
                case "2":
                    System.out.println("La nota mas alta es: "+ Notas.notaMasAlta(notas));
                    break;
                case "3":System.out.println("La nota mas baja es: "+ Notas.notaMasBaja(notas));
                    break;
                case "4":System.out.println("Los alumnos por encima de la media son: " + Notas.alumnosEncima(notas));
                    break;
                case "5":System.out.println("Los alumnos por debajo de la media: "+ Notas.alumnosBajoNota(notas));
                    break;
                case "0":
                    salirMenu=true;
                    break;
                default:
                    System.out.println("Opcion incorrecta intente elegir una dentro del menu de opciones");
            }
        }while (!salirMenu);
    }
}
