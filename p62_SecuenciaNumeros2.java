// Objetivo - Se desea imprimir la secuencia de números mostrados en n cantidad de renglones

import java.util.Scanner;

public class p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        int i,j,n;
        char resp;

        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("\n---Programa para imprimir una secuencia x de números en x renglones---\n");
            System.out.print("Ingrese la cantidad de renglones: "); n = obj.nextInt();
            for(i=1; i<=n; i++) {
                for(j=1; j<=i; j++) {
                    System.out.print(j + " ");
                    }
                    System.out.println();

                }
                System.out.println();
            System.out.print("\nDeseas continuar (S/N)?: ");
            resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nProceso terminado ..");   
    }
    
}