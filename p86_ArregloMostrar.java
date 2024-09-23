/**
 * Innerp86_ArregloMostrar
 */

public class p86_ArregloMostrar {

    public static void Mostrar(int[] x) {
        for(int i=0; i<x.length; i++)
            System.out.print(x[i] + " ");
        System.out.println();
    }
    
    public static void Cuadrado(int[] x){
        for(int i=0; i<x.length; i++)
            x[i] = x[i] * x[i];
    }

    public static void main(String[] args){
        int[] A = {7,8,9,10,12};
        int[] B = {1,2,3,4,5,6};

        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.println("Arreglo A: ");
        Mostrar(A);
        System.out.println("Arreglo A: ");
        Mostrar(B);
        System.out.println("Arregla A elevado al cuadrado: ");
        Cuadrado(A);
        Mostrar(A);
        System.out.println("Arreglo B elevado al cuadrado: ");
        Cuadrado(B);
        Mostrar(B);
    }

}
