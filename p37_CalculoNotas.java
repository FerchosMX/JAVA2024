// Objetivo - Calcular el promedio de 5 calificaciones

import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner scanner = new Scanner(System.in);
        int cal1,cal2,cal3,cal4,cal5;
        double calFinal;

        System.out.println("--- UAZ GRADES ---");
        System.out.println("Dame tus calificaciones");
        System.out.print("Calificación 1: ");
        cal1 = scanner.nextInt();
        System.out.print("Calificación 2: ");
        cal2 = scanner.nextInt();
        System.out.print("Calificación 3: ");
        cal3 = scanner.nextInt();
        System.out.print("Calificación 4: ");
        cal4 = scanner.nextInt();
        System.out.print("Calificación 5: ");
        cal5 = scanner.nextInt();

        calFinal = (cal1+cal2+cal3+cal4+cal5)/5.0;

        if (calFinal<=6) {
            System.out.println("Reprobado :(");
        } else if (calFinal<=7) {
            System.out.println("Pasaste de panzado");
        } else if (calFinal<=8) {
            System.out.println("Pasaste, muy bien");
        } else if (calFinal<=9) {
            System.out.println("Pasaste, excelente");
        } else if (calFinal<=10) {
            System.out.println("Pasate de forma perfecta :D");
        } else {
            System.out.println("What");  
        }
        scanner.close();
    }
}
