package Ejercicio2;

/*
Ejercicio 2.- Deseamos realizar un programa para el cálculo de ciertos valores con las notas de la
clase. Queremos calcular la nota media, la nota más alta, la más baja, cuántos alumnos tienen una
nota superior a la media y cuántos tienen una nota inferior a la media. El programa debe presentar
un menú de opciones para que el usuario elija lo que desee hacer y también se presentarán los
resultados. El array de notas se generará aleatoriamente con notas de 1 a 10
 */
public class Notas {

    static int notaAlta;
    static int contTotalNotas=0;
    static int contTotalAlumnos;



    public static int [] crearRandom(int[] array){

        contTotalAlumnos=0;
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*10);
            contTotalAlumnos++;
        }
        return array;
    }

  public static int totalNotas(int [] array){

        for (int i=0;i<array.length;i++){

            contTotalNotas+=array[i];
    }
      return contTotalNotas;
    }

   public static int notaMedia(){
     return contTotalNotas/contTotalAlumnos;
    }

    public static int notaMasAlta(int [] notas){
        System.out.println("Las notas son las siguientes: ");
        int [] ordenarNotas=new int[contTotalAlumnos];
        for (int i=0;i<notas.length-1;i++){
            System.out.print(notas[i]+ ", ");
            for (int j=0;j<ordenarNotas.length-1;j++){
                if (ordenarNotas[j]>notas[i]){
                    int aux=ordenarNotas[j];
                    ordenarNotas[j]=ordenarNotas[i+1];
                    ordenarNotas[j+1]=aux;

                }
            }
        }
        return notas[9];
    }


}
