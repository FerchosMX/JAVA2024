//Objetivo - Calcular el area de un circulo 
import java.util.Scanner;

public class p02_AreaCirculo {
    public static void main(String[] args) {
        //Variables
        double radio, area;
        //Leer una entrada de la consola y asignarlo a lradio
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando el radio de un circulo");
        System.out.print("Dame el radio: ");
        radio = lradio.nextFloat();

        //Math = librería de operaciones o valores matemáticas
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El circulo de radio " + radio + " tiene un area de " + area);
    }
}