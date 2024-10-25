import java.io.File;
import java.util.Scanner;

public class p126_Excepcion6 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        File nombres = new File("nombres.txt");
        try {
            Scanner obj = new Scanner(nombres);
            while (obj.hasNextLine())
            System.out.println(obj.nextLine());
        } catch (Exception e) {

                System.out.println("Problemas al procesar el archivo ..");
        }
    }
}