package p120_Vehículo;

public class Suv extends Maquina implements TodoTerreno {
    public Suv(String Nombre){
        super(Nombre);

    }

    @Override
    public void chasisIndependiente() {
        System.out.println("Es un automovil con chasis independiente -> es una Suv");
        
    }

    public void traccion4x4() {
        System.out.println("Es un automovil con tracción4x4 -> Es un Suv");
        
    }

    public void sistemaElectrico(){
        System.out.println("Es un automovil con sistema eléctrico -> Es una Suv");

    }

    public void combustionInterna(){
        System.out.println("Es un automovil con combustión interna -> Es una Suv");

    }
}
