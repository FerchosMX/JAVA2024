// Objetivo - Calcular el pago de un trabajador 
import java.util.Scanner;

public class p04_PagoTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas; //Se busca que sea exacto, por lo tanto INT 
        double paga, tasa, impuesto, pagabruta, paganeta; 
        Scanner obj = new Scanner(System.in);
       
        System.out.println("\nCalculando la paga de un trabajador\n");
        // Entrada
        System.out.println("Dame el nombre: "); nombre = obj.nextLine();
        System.out.println("Dame las horas trabajadas: "); horas = obj.nextInt();
        System.out.println("Pago x hora: "); paga = obj.nextFloat();  
        tasa = 0.03;
        //Proceso
        pagabruta = horas * paga; 
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;
        //Salida
        System.out.println(String.format("EL trabajador %s trabajó %d horas con una paga de %.2f pesos y una tasa de impuestos de %.2f",nombre,horas,paga,tasa));
        System.out.println(String.format("Paga Bruta = %.2f", pagabruta));
        System.out.println(String.format("Impuestos = %.2f", impuesto));
        System.out.println(String.format("Paga Neta = %.2f", paganeta));

    }   
}