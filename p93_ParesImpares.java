import java.util.Random;

public class p93_ParesImpares {
    public static void main(String[] args) {
        final int MAX = 100; //Cantidad máxima 100
        int[] a = new int[MAX]; //a[MAX]
        int[] b = new int[MAX];//b[MAX]
        int Pares=0;
        int Impares=0;
        
        System.out.print("\033[H\033[2J");

        Random random = new Random();

        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(21);  
            b[i] = random.nextInt(21);  
        }

        System.out.println("------Arreglos------");

        System.out.println("\nElementos del arreglo a: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nElementos del arreglo b: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(b[i]+" ");


        }
        System.out.println();

        System.out.println("\n-----Pares del Arreglo-----");

        System.out.println("\nElementos pares del arreglo a:");
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                Pares++;
            }
        }

        System.out.println("\nElementos pares del arreglo b:");
        for (int i = 0; i < 20; i++) {
            if (b[i] % 2 == 0) {
                System.out.print(b[i] + " ");
                Pares++;
            }
        }
        System.out.println("\nCantidad de números pares: " + Pares);

        System.out.println("\n------Impares del Arreglo-----");
        System.out.println("\nElementos impares del arreglo a:");
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                Impares++;
            }
        }
        System.out.println("\nElementos impares del arreglo b:");
        for (int i = 0; i < 20; i++) {
            if (b[i] % 2 != 0) {
                System.out.print(b[i] + " ");
                Impares++;
            }
        }
        System.out.println("\nCantidad de números impares: " + Impares);
    }
}


