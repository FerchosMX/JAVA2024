import java.util.Random;

public class p89_ArregloAleatorios {

    public static void Mostrar(float[] x){
        for(int i=0; i<x.length; i++)
            System.out.printf("%2.2f ",x[i]);
        System.out.println();
    }

    public static void GenerarAleatorios(float[] x){
        float min=1.5f, max=10.5f;
        for(int i=0; i<x.length; i++)
            x[i] = new Random().nextFloat(max - min )+min;
    }

    public static void SumaArreglos(float[] x, float[] y, float z[]){
        for(int i=0; i<x.length; i++)
            z[i] = x[i] + y[i];

    }

    public static void main(String[] args) {
        int MAX = 10; //Aquí cambio el tamaño del arreglo
        float[] f1 = new float[MAX];
        float[] f2 = new float[MAX];
        float[] f3 = new float[MAX];

        System.out.print("\033[H\033[2J");

        GenerarAleatorios(f1);
        GenerarAleatorios(f2);
        System.out.println("Arreglos de numeros aleatorios: ");
        Mostrar(f1);
        Mostrar(f2);
        SumaArreglos(f1,f2,f3);
        System.out.println("La suma es: ");
        Mostrar(f3);
    }
    
}
