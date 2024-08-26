// Programa que administré el pago de un estacionamiento de acuerdo a la zona

import java.util.Scanner;

public class p32_PagoEstacionamiento {
    public static void main(String[] args) {
        float pago, total, imp;
        char est;
        Scanner obj = new Scanner(System.in);

        pago = total = imp = 0;

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Elige el tipo de estacionamiento que usaste: ");
        System.out.println("Estacionamiento [N]orte - 3%");
        System.out.println("Estacionamiento [S]ur - 5%");
        System.out.println("Estacionamiento [E]ste - 10%");
        System.out.println("Estacionamiento [O]este - 20%");
        System.out.print("Elige: ");
        est = Character.toUpperCase(obj.next().charAt(0) );

        switch (est) {
            case 'N': imp = 0.03f; break;
            case 'S': imp = 0.05f; break;
            case 'E': imp = 0.10f; break;
            case 'O': imp = 0.20f; break;
            default:
                break;
        }
        System.out.print("Cuánto pagaste: "); pago = obj.nextFloat();
        total = pago * (1+imp);

        System.out.printf("El total inicial fue: %.2f y el total con impuesto fue %.2f a una tasa de %.2f ",pago,total,imp);
    }
}
