// Dado un numero entre 1 y 7, y nos muestra el día de la semana con letra que cada número representa

import java.util.Scanner;

public class p30_DiaSemana {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("----Dame un número entre 1 y 7 y te diré el día de la semana con letra----");
        int dia = new Scanner(System.in).nextInt();

        switch (dia) { 
            case 1: System.out.println("1 es Domingo"); break;      
            case 2: System.out.println("2 es lunes"); break;      
            case 3: System.out.println("3 es Martes"); break;      
            case 4: System.out.println("4 es Miércoles"); break;      
            case 5: System.out.println("5 es Jueves"); break;      
            case 6: System.out.println("6 es Viernes"); break;      
            case 7: System.out.println("7 es Sábado"); break;      
            default:
              System.out.println("No existe ese día >:("); break;
        }
        System.out.println("Gracias por utilizar este programa");
    }
    
}
