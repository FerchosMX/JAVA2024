// Objetivo - Imprimir números impares de forma ascendente desde 1 hasta n
// además, se necesita imprimir la suma y el promedio de esos números.

import java.util.Scanner;

public class p48_ImparesAscendente {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("--Imprimiendo los numeros impares de 0 a n--\n");
        System.out.print("Dime el valor límite: "); int n = new Scanner(System.in).nextInt();
        
        int suma = 0;
        int cont = 0;

        System.out.print("Números Impares: ");
        for (int i=1; i <= n; i +=2) {
            System.out.print(i);
            if (i < n -1) {
                System.out.print(",");
                
            }
            suma += i;
            cont++;
        }

        double promedio = (cont>0)?(double) suma/cont:0;
        
        
        System.out.printf("\nSuma de los números impares: %d%n", suma);
        System.out.printf("\nPromedio de los números impares: %.2f%n", promedio);
    }
    
}
