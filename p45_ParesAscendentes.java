// Objetivo - Se desean imprimir los impares de forma descendente de n a 1

import java.util.Scanner;

public class p45_ParesAscendentes {
    public static void main(String[] args) {
        char resp;
        int c,n,s;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush(); 


        do {
            n=s=0;
            System.out.println("Imprime pares de forma ascendente de 2 hasta 1\n");
            System.out.println("Hasta donde deseas los pares?: "); n = obj.nextInt();

            //if(n%2 == 0) n++;
            c = (n % 2 == 0 ? ++n : n);
            while (c >= 1) {    
                System.out.printf("%d ", c);
                s += c;
                c -=2;
    
            }
            System.out.printf("\nLa suma de los pares hasta %d es %d",n,s);

            System.out.println("\nDeseas continuar (S/N)"); resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp !='N');
        System.out.println("\nProceso terminado.");
    }
}
