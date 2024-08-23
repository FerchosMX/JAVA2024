// Convertir a grados fahrenheit o grados celsius según lo que elija el usuario
import java.util.Scanner;

public class p23_ConvertirTempratura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        float temp,res;
        int op;
        Scanner obj = new Scanner(System.in);

        System.out.println("Convirtiendo temperaturas ");
        System.out.println("Elije una opción: ");
        System.out.println( "[1] Fahrenheit a Centigrados"); 
        System.out.println( "[2] Centigrados a Fahrenheit");
        op = obj.nextInt();

        if (op==1) {
            System.out.println("----Convirtiendo de Fahrenheit a Centigrados---- ");
            System.out.println("Dame la temperatura en Fahrenheit: "); temp=obj.nextFloat();
            res = (temp -32)*5f/9f;
            System.out.printf("%.2f Fahrenheit equivale a %.2f Centigrados",temp,res);
        } else if (op==2) {
            System.out.println("----Convirtiendo de Centigrados a Fahrenheit---- ");
            System.out.println("Dame la temperatura en Centigrados: "); temp=obj.nextFloat();
            res = (temp *9/5)+32f;
            System.out.printf("%.2f Centigrados equivale a %.2f Fahrenheit",temp,res);
        } else 
        System.out.println("\nAcaso estás locoooo???");
        
        System.out.println("\nGracias por usar el programa");
    }
}