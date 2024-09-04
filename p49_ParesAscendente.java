import java.util.Scanner;

public class p49_ParesAscendente {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("--Imprimiendo los numeros pares de n a 1--\n");
        System.out.print("Dime el valor límite: "); int n = new Scanner(System.in).nextInt();
        
        int suma = 0;
        int cont = 0;

        int inicio = (n % 2 == 0) ? n : n - 1;

        System.out.print("Números Pares: ");
        for (int i = inicio; i >= 2; i -=2) {
            System.out.print(i);
            if (i > 2) {
                System.out.print(", ");
                
            }
            suma += i;
            cont++;
        }

        if (inicio == 2) {
            System.out.println("2");
            suma += 2;
            cont++;
            
        }

        double promedio = (cont>0)?(double) suma/cont:0;
        
        
        System.out.printf("\nSuma de los números impares: %d%n", suma);
        System.out.printf("\nPromedio de los números impares: %.2f%n", promedio);
    }
    
}
