// Objetivo - Dado el nombre, sexo, edad y 3 calificaciones recientes, dar como resultado 
// si el alumno será aceptado o no tomando en cuenta que solo pueden entrar mujeres +21 edad con un promedio de 8 y 9.5

import java.util.Scanner;

public class p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner scanner = new Scanner(System.in);
        
        String nombre;
        char sexo;
        int edad,cal1,cal2,cal3,prom;


        System.out.println("--- Universidad Chilaquiles ---");
        System.out.print("      Introduzca su nombre: ");
        nombre = scanner.nextLine();
        System.out.print("      Introduzca su sexo (M/F): ");
        sexo = scanner.next();
        System.out.print("      Introduzca su edad: ");
        edad = scanner.nextInt();
        System.out.println("\n  Ahora introduzca sus últimas 3 calificaciones");
        System.out.println("1ra calificación: ");
        cal1 = scanner.nextInt();
        System.out.println("2da calificación: ");
        cal2 = scanner.nextInt();
        System.out.println("3ra calificación: ");
        cal3 = scanner.nextInt();

        prom = (cal1+cal2+cal3)/3;

        if (sexo = 'M') {
            System.out.println("Lo lamento pero no estás aceptado");
            } else if (edad<21) {
                System.out.println("Lo lamento pero no estás aceptado");
            } else if (prom<8) {
                System.out.println("Lo lamento pero no estás aceptado");
            }
        }
    }
    
}
