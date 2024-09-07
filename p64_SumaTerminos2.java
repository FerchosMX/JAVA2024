// Objetivo - Se desea imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma

import java.util.Scanner;

public class p64_SumaTerminos2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        int suma=0,numero=0,i,n;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("Cuantos números ? "); n = obj.nextInt();
                for(i=1; i<=n; i++) {
                numero = numero *10 + 1;
                suma += numero;
                System.out.println(numero);
                if (i < n) {
                    System.out.println(" + ");
                }
            }
            System.out.print("\nSuma es = "+suma);
            System.out.print("\nDeseas continuar (S/N)?: ");
            resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nProceso terminado ..");
    }
    
}

