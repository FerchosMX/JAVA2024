// Objetivo - Calcular el promedio de calificaciones
import java.util.Scanner;

public class p06_PromedioCalificaciones {
    public static void main(String[] args) {
        float cal1, cal2, cal3, suma, prom, min, max;
        cal1=cal2=cal3=0;
        Scanner obj=new Scanner(System.in);

        //Lee calificaciones
        System.out.println("Calculando el promedio de tres calificaciones, calculando también la mayor y la menor: \n");
        System.out.print("Dame la calificación 1: "); cal1 = obj.nextFloat();
        System.out.println("Dame la calificacion 2: "); cal2 = obj.nextFloat();
        System.out.println("Dame la calificación 3: "); cal3 = obj.nextFloat();

        //Realiza los cálculos
        suma = cal1 + cal2 + cal3;
        prom = suma/3;
        min = Math.min(Math.min(cal1,cal2),cal3);
        max = Math.min(Math.max(cal1,cal2),cal3);

        //"printf" para que funcione con "float"
        System.out.printf("\nLas calificaciones introducidas son: %.2f, %.2f, %.2f\n",cal1,cal2,cal3);
        System.out.printf("La suma: %.2f\n",suma);
        System.out.printf("El promedio: %.2f\n",prom);
        System.out.printf("La menor: %.2f\n",min);
        System.out.printf("La mayor: %.2f\n",max);
    }    
}
