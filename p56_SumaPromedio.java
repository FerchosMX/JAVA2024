// Objetivo - 

import java.util.Scanner;

public class p56_SumaPromedio {
    public static void main(String[] args) {
        float cal,suma,prom;
        int n;
        boolean repite=true;

        while (repite) {
            
        System.out.print("\033[H\033[2J"); System.out.flush(); 

        Scanner obj = new Scanner(System.in);
        System.out.println("---Suma y promedio de n calificaciones---\n");
        cal=suma=prom=0;

        System.out.print("Cuántas calificaciones deseas procesar?: ");
        n = obj.nextInt();
        for (int x=1; x<=n; x++) {
            System.out.println("Calificación "+ x + "?");
            cal = obj.nextFloat();
            suma += cal;

        }
        prom = suma/n;
        System.out.println("La suma es: "+ suma);
        System.out.println("El promedio es: "+ prom);
        System.out.println("Deseas repetir (s/n)? ");
        String resp = obj.next().toLowerCase();
        repite = resp.equals("s");
        System.out.println("Proceso terminado");
        }
    }
}
