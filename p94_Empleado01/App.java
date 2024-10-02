package p94_Empleado01;

// -----PROGRAMA PRINCIPAL-----
public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(); //Instanciar una clase (Crear un objeto de una clase)
        Empleado empleado2 = new Empleado(); 

        empleado1.Nombre = "Juan";
        empleado1.Edad = 45;
        empleado2.Nombre = "Silvia";
        empleado2.Edad = 28;

        Empleado empleado3;
        empleado3 = new Empleado();
        empleado3.Nombre = "Jorge";
        empleado3.Edad = 20;


        System.out.print("\033[H\033[2J");
        System.out.println("Empleado 1 nombre: "+ empleado1.Nombre);
        System.out.println("Empleado 1 edad:   "+empleado1.Edad);
        System.out.println(empleado1.toString());
        System.out.println("Empleado 2 nombre: "+ empleado2.Nombre);
        System.out.println("Empleado 2 edad:   "+empleado2.Edad);
        System.out.println(empleado2.toString());
        System.out.println("\nEmpleado3");
        System.out.println(empleado3.toString());

    }

}
