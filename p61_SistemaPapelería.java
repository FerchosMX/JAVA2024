// FERNANDO DE LA TORRE LÓPEZ DE LARA - PRÁCTICA 1ER EXAMEN POO

/*
Objetivo - Una empresa fotocopiadora requiere un programa que le permita llevar el control de su venta de
fotocopias. El valor de la copia es: 
Carta $3, Oficio $4, Doble Oficio $6, debe mostrarse un
resumen de ventas con un mensaje de acuerdo a la venta total:
▪ venta menor 50 pesos - “venta moderada”
▪ venta entre 50 y 100 pesos - “venta frecuente
▪ venta mayor a 101 - “venta superada”
*/

import java.util.Scanner;

public class p61_SistemaPapelería {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        Scanner obj = new Scanner(System.in);

        // Declaramos Variables
        int CostoCarta=3, CostoOficio=4, CostoDoficio=6, precioFinal=0, Cantidad=0, CantidadC=0,CantidadO=0,CantidadDO=0,ContadorVentas=0;
        char tipoCopia, resp;


        System.out.println("--------------------------------");
        System.out.println("Papelería la Malena, SA. de CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("--------------------------------\n");

        // Hacemos el sistema de elección de copias y asignación de variables
        do {
            System.out.print("\nTipo de copia: (C)arta $3, (O)ficio $4, (D)oble Oficio $6 -> ");
            tipoCopia = obj.next().charAt(0);

            System.out.print("Cantidad de copias: ");
            Cantidad = obj.nextInt();

            // Comenzamos los switch statements para cada una de las opciones de venta 
            switch (Character.toUpperCase(tipoCopia)) {
                case 'C':
                    CantidadC = Cantidad; // Asignación de variables
                    precioFinal += Cantidad * CostoCarta; 
                    break;
                case 'O':
                    CantidadO = Cantidad;
                    precioFinal += Cantidad * CostoOficio;
                    break;
                case 'D':
                    CantidadDO = Cantidad;
                    precioFinal += Cantidad * CostoDoficio;
                    break;
            
                default:
                    System.out.println("Opción no válida");
                    break;

                }

                // Aquí se va sumando la cantidad de ventas que quiere el usuario
                ContadorVentas++;
                System.out.print("Otra venta (S/N)? \n"); 
                resp=Character.toUpperCase(obj.next().charAt(0));        
          
            } while (resp!= 'N');

        // Diseño visual e impresión de resultados
        System.out.println("\nProceso Terminado\n");

        System.out.println("--------------------------------");
        System.out.println("    Resumen diario de ventas");
        System.out.println("--------------------------------");

        System.out.println("\nVentas realizadas: "+resp);
        System.out.println("-----------------------");
        System.out.println("Carta      : "+CantidadC+" - $"+ CostoCarta*CantidadC);
        System.out.println("Oficio     : "+CantidadO+" - $"+ CostoOficio*CantidadO);
        System.out.println("Doble Of.  : "+CantidadDO+" - $"+ CostoDoficio*CantidadDO);
        System.out.println("-----------------------");
        System.out.print("Tot. de ventas: "+ContadorVentas+" - $ "+precioFinal);

        // If statement para clasificar el precio total en uno de los 3 tipos de ventas
        if (precioFinal<=50) {
            System.out.println("\nEsta venta es una: Venta Moderada");
        } else if (precioFinal<=100 && precioFinal>=50) {
            System.out.println("\nEsta venta es una: Venta Frecuente");
        } else { 
            System.out.println("\nEsta venta es una: Venta Superada");
        }
        obj.close();
    }
}

