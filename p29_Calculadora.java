// Realiza operaciones matemáticas básicas sobre dos números 

import java.util.Scanner;

public class p29_Calculadora {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double n1,n2;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.println("Efectuando operaciones matemáiticas básicas sobre dos números");
        System.out.print("Dame numero 1: "); n1 = obj.nextFloat();
        System.out.print("Dame numero 1: "); n2 = obj.nextFloat();
        System.out.print("Operación + - * / ^: "); op = obj.next().charAt(0);

        switch (op) {
            case '+': System.out.printf("%.2f + %.2f = %.2f",n1,n2,n1+n2); break;
            case '-': System.out.printf("%.2f - %.2f = %.2f",n1,n2,n1-n2); break;
            case '*': System.out.printf("%.2f * %.2f = %.2f",n1,n2,n1*n2); break;
            case '/': System.out.printf("%.2f / %.2f = %.2f",n1,n2,n1/n2); break;
            case '^': System.out.printf("%.2f ^ %.2f = %.2f",n1,n2,Math.pow(n1,n2)); break;
            default: System.out.println("Esa operación no está implementedada"); break;
        }
    }
}
