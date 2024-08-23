
import java.util.Scanner;

public class p27_AceptarEstudiante {
    public static void main(String[] args) {
        String nombre;
        int edad;
        double c1,c2;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Sistema de admisión de la UAZ");
        System.out.print("Dame tu nombre: "); nombre = obj.nextLine();
        System.out.print("Dame tu edad: "); edad = obj.nextInt();

        if (edad<18) System.out.println("No aceptamos menores de edad"); 
        else {
            System.out.println("Dame calificaión 1: "); c1=obj.nextDouble();
            System.out.println("Dame calificaión 2: "); c2=obj.nextDouble();
            if(c1<8 || c2<8) System.out.println("\nNo tienes el promedio necesario mínimo");
            else System.out.printf("Bienvenido a la escuela %s",nombre);
        }

        System.out.println("\nGracias por usar el sistema :D ");
    }
    
}
