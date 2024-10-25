package p120_Vehículo;

public class Maquina {
    private String Nombre;
    private String Propietario;
    private String Pasajeros;

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getPropietario() {
        return Propietario;
    }
    public void setPropietario(String propietario) {
        Propietario = propietario;
    }
    public String getPasajeros() {
        return Pasajeros;
    }
    public void setPasajeros(String pasajeros) {
        Pasajeros = pasajeros;
    }

    public Maquina(String nombre){
        Nombre = nombre;
    }

    public void repostar(){
        System.out.println("Repostando...");
    }
    
    public void arrancar(){
        System.out.println("Arrancando...");
    }

    public void frenar(){
        System.out.println("Frenando...");
    }
}
