package Ejercicio2;

/*
Ejercicio 2.- Deseamos realizar un programa para el cálculo de ciertos valores con las notas de la
clase. Queremos calcular la nota media, la nota más alta, la más baja, cuántos alumnos tienen una
nota superior a la media y cuántos tienen una nota inferior a la media. El programa debe presentar
un menú de opciones para que el usuario elija lo que desee hacer y también se presentarán los
resultados. El array de notas se generará aleatoriamente con notas de 1 a 10
 */
public class Notas {



    static int totalAlumnos=MenuNotas.numeroElementos();




    public static int [] crearRandom(int[] array){


        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*10);

        }
        return array;
    }



  public static int notaMedia(int [] array){

      int contTotalNotas=0;
        for (int i=0;i<array.length;i++){

            contTotalNotas+=array[i];
    }
      return contTotalNotas/totalAlumnos;
    }



    /**
     * Metodo por el que ordenamos un array de menor a mayoy e intentamos quedarnos con la nota mas alta
     * @param notas
     * @return
     */
    public static int notaMasAlta (int[] notas){
        int mayor=notas[0];
        for (int i=1; i< notas.length; i++){
            if (notas[i]>mayor){
                mayor=notas[i];
            }
        }
        return mayor;
    }
    public static int notaMasBaja (int[] notas){
        int menor=notas[0];
        for (int i=1; i< notas.length; i++){
            if (notas[i]<menor){
                menor=notas[i];
            }
        }
        return menor;
    }

    public static int alumnosEncima(int [] notas){
        int contadorMasAlta=0;
        for (int i=0; i<notas.length;i++){
            if (notas[i]>=5){
                 contadorMasAlta++;
            }
         }
        return contadorMasAlta;
    }
    public static int alumnosBajoNota(int [] notas){
         int contadorMasbaja=0;
        for (int i=0; i<notas.length;i++){
            if (notas[i]<5){
                contadorMasbaja++;
            }
        }
        return contadorMasbaja;
    }


}
