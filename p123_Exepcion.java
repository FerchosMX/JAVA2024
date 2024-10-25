import java.util.Scanner;
import java.util.InputMismatchException;

public class p123_Exepcion {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        try {
            System.out.println("Valor del numerador: "); int a = obj.nextInt();
            System.out.println("Valor del denominado: "); int b = obj.nextInt();
            int c = a/b;
            System.out.println("El resultado es "+c);
        } catch (ArithmeticException e) {
            System.out.println("El denominado no puede ser 0");
        
        } catch (InputMismatchException e){
            System.out.println("Numerador y Denominador deben ser números enteros");
        }
    }
}
