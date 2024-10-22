package p119_Organismo;

public class Perro extends Organismo implements Canino {
    public Perro(String Nombre){
        super(Nombre);
    }

    @Override
    public void correr() {
        System.out.println("Es un canino que corre = Es un perro");
        
    }

    @Override
    public void cuatroPatas() {
        System.out.println("Es un canino que camina en cuatro patas = Es un perro");
        
    }

    @Override
    public void multiCelular() {
        System.out.println("Es un animal multicelular = Es un perro");
        
    }

    @Override
    public void sangreCaliente() {
        System.out.println("Es un animal de sangre caliente = Es un perro");
        
    }

    
}
