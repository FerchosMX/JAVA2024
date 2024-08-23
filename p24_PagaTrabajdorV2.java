// Calcula la paga de un trabajador, las horas extras se pagan doble 
import java.util.Scanner;

public class p24_PagaTrabajdorV2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        String nombre;
        int horas,extra;
        float paga,impuesto,tasa,pagabruta,paganeta;
        Scanner obj = new Scanner(System.in);

        tasa = 0.02f;

        System.out.println("Calculando la paga de un trabajador, las horas se pagan el doble");
        System.out.println("Nombre: "); nombre=obj.nextLine();
        System.out.println("Horas Trabajadas: "); horas=obj.nextInt();
        System.out.println("Pago x hora: "); paga=obj.nextFloat();

        if(horas>40) {
            extra = horas - 40;
            pagabruta = 40 * paga + (extra*paga*2);
        } else { 
            pagabruta = horas*paga;
        }
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;
        System.out.printf("El trabajador %s trabajó %d horas a una paga de %.2f pesos, a una tasa de %.2f\n",nombre,horas,paga,tasa);
        System.out.println("Paga bruta = "+pagabruta);
        System.out.println("Impuesto = "+impuesto);
        System.out.println("Paga neta = "+paganeta);

        
    }
}
