// Convertir de grados Celcius a Farenheit y viceversa usando fuciones

import java.util.Scanner;

public class p67_ConversiónTemperaturas {

    public static float CaF(float temp){
        return (temp * 9.0f / 5.0f) + 32;
    }
    public static float FaC(float temp){
        return (temp - 32) * 5.0f / 9.0f;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        int op;
        float temp;

        do{ 
        System.out.println("CONVERSIÓN DE TEMPERATURAS");
        System.out.println("1. C a F\n2. F a C\n3. Salir\n");
        System.out.println("Elige: "); op = obj.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Convertir de C a F");
                    System.out.print("Dame la temperatura: "); temp = obj.nextFloat();
                    System.out.print("\nEl resultado es: "+CaF(temp));
                    break;
                case 2:
                    System.out.println("Convertir de F a C");
                    System.out.println("Dame la temperatura: "); temp = obj.nextFloat();
                    System.out.println("El resultado es: "+FaC(temp));
                    break;
                case 3:
                    System.out.println("\nGracias por usar el programa");
                    break;
                default:
                    break;
            }
            System.out.println("<Presiona cualquiér tecla para continuar>"); obj.nextLine();obj.nextLine();
        } while(op!=3);
        System.out.println("\nPrograma terminado");
    }
    
}
