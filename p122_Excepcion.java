import java.util.Scanner;

public class p122_Excepcion {
    public static void main(String[] args) {
        try {
            System.out.print("\033[H\033[2J");
            System.out.println("Dame un valor: ");
            int val = new Scanner(System.in).nextInt();
            val = val + 5;
            System.out.println("El nuevo valor es "+val);
        } catch (Exception e) {
            System.out.println("Debes introducir un número");
        }
    }
    
}
