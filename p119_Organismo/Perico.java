package p119_Organismo;

public class Perico extends Organismo implements Ave{
   public Perico(String nombre){
        super(nombre);
   }

@Override
public void dosPatas() {
    System.out.println("Es un ave y camina en dos patas = Es un Perico");
    
}

@Override
public void volar() {
    System.out.println("Es un ave que puede volar = Es un perico");
    
}

@Override
public void multiCelular() {
    System.out.println("Es un animal multicelular = Es un perico");
    
}

@Override
public void sangreCaliente() {
    System.out.println("Es un animal de sangre caliente = Es un perico");
    
}

   
}
