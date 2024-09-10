/*  Objetivo -Una escuela ha organizado un curso de técnicas avanzadas de programación y desea llevar el control de la
inscripción de los participantes y el dinero recaudado. */

// FERNANDO DE LA TORRE LÓPEZ DE LARA - 1ER EXAMEN PARCIAL

import java.util.Scanner;

public class ep01_PrimerExamenParcial {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        String nombre;
        double promEdad=0.0,sumaEdad=0;
        int edad=0,costoAl=40,costoDoc=60,costoTrab=80;
        int ContAl=0,ContDoc=0,ContTrab=0,ContHombres=0,ContMujeres=0,ContGen=0,ContRech=0;
        int totalDinAl=0,totalDinDoc=0,totalDinTra=0,DinTotal=0;
        char sexo,resp,tipo;

        Scanner obj = new Scanner(System.in);

        
        System.out.println("       ------ESCUELA JUANITA PEREZ------");
        System.out.println("SISTEMA DE INSCRIPCIÓN PARA CURSO DE PROGRAMACIÓN");
        System.out.println("--------------------------------------------------\n");

        do {     
        System.out.println("DATOS ");
        System.out.print("Nombre: ");
        nombre = obj.nextLine();
        System.out.print("Edad: ");
        edad = obj.nextInt();
        sumaEdad += edad;
        promEdad++;
        obj.nextLine();
        System.out.print("Sexo (M/F): "); 
        sexo = Character.toUpperCase(obj.next().charAt(0));
        obj.nextLine();

        switch (Character.toUpperCase(sexo)) {
            case 'M':
                ContHombres++;
                ContGen++;
                break;
            case 'F':
                ContMujeres++;
                ContGen++;
                break;
            default:
            System.out.println("No válido");
                break;
        }   
        System.out.print("Tipo de participante (A)lumno, (D)ocente, (T)rabajador: \n");
        tipo = Character.toUpperCase(obj.next().charAt(0)); 
        obj.nextLine();
        switch (Character.toUpperCase(tipo)) {
            case 'A': 
                ContAl++;
                totalDinAl += costoAl;
                break;
            case 'D':
                ContDoc++;
                totalDinDoc += costoDoc;
                break;
            case 'T':
                ContTrab++;
                totalDinTra += costoTrab;
                break;
            default:
                System.out.println("No válido");
                break;
        }
        
            if (edad<=23) { 
                System.out.println("\nNo cumples con los requisítos de edad");
                ContRech++;
            } else {
                System.out.println("\n-----------------------------");
                System.out.println("RESUMEN DE PERSONA INSCRITA");
                System.out.println("-----------------------------");
                System.out.println("Bienvenido "+nombre+ " , estás inscrito!");
                System.out.println("\nInformación: ");
                System.out.println(nombre+" , "+edad+" , "+sexo+" , "+tipo);
            }
                System.out.print("Inscribir otra persona (S/N)? \n"); 
                resp=Character.toUpperCase(obj.next().charAt(0)); 
                obj.nextLine();
            
        } while (resp!='N');

        DinTotal = totalDinAl + totalDinDoc + totalDinTra;

        System.out.println("\n---------- CONTEO -----------");
        System.out.println("Total de Alumnos: "+ContAl);
        System.out.println("Total de Docentes: "+ContDoc);
        System.out.println("Total de Trabajadores: "+ContTrab);
        System.out.println("Total de Hombres: "+ContHombres);
        System.out.println("Total de mujeres: "+ContMujeres);
        System.out.println("Total de todos los participantes: "+ContGen);
        System.out.println("Promedio edad de los participantes: "+(sumaEdad/ContGen));
        System.out.println("Total de rechazados: "+ContRech);
        System.out.println("-------------------------");

        System.out.println("\n------------- DINERO --------------");
        System.out.println("Total dinero recaudado de Alumnos: "+totalDinAl);
        System.out.println("Total dinero recaudado de Docentes: "+totalDinDoc);
        System.out.println("Total dinero recaudado de Trabajadores: "+totalDinTra);
        System.out.println("Total dinero recaudado en general: "+DinTotal);

        if (DinTotal<=50) {
            System.out.println("\nEl evento concluye con ganancias BAJAS");
        } else if (DinTotal<=1000 && DinTotal>=50) {
            System.out.println("\nEl evento concluye con ganancias MODERADAS");
        } else { 
            System.out.println("\nEl evento concluye con ganancias BUENAS");
        }
        obj.close();
        }
    }
    

