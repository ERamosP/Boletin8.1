package Ejercicio4;

public class Main_Eras {
    public static void main(String[] args) {

        int numeroElementos=Eratostenes.pedirNumero();
        int[] array=new int[numeroElementos];
        Eratostenes.crearSecuencia(array);
        System.out.println("--------------------------------------------");
        int [] array2=Eratostenes.divirEntreDos(array);
        System.out.println("--------------------------------------------");
        Eratostenes.divirEntreTres(array2);
    }
}
