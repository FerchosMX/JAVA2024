// Objetivo - Programa que calcule la suma y promedio

import java.util.Scanner;

public class p41_ProcesaCalificaciones {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); 

        int n,c;
        float cal,suma,prom;
        Scanner obj = new Scanner(System.in);
        suma = prom = 0;

        System.out.println("Calcular la suma y el promedio de n calificaciones\n");
        System.out.println("Cuántas calificaciones?: "); n = obj.nextInt();

        c=1;
        while (c <= n){
            System.out.printf("Calificaciones %d = ",c);
            cal = obj.nextFloat();
            suma = suma + cal;
            c++;
        }
        prom = suma/n;
        System.out.printf("La suma es:   %.2f",suma);
        System.out.printf("\nEl promedio es:   %.2f",prom);
    }
}
