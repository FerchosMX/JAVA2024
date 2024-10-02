package p95_Empleado02;

public class Empleado {
    private String nombre;
    private int Edad;
    public String getNombre() { 
    //Source Action -> Getters and Setters 
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }

    public String toString() {
        return "Empleado [nombre=" + nombre + ", Edad=" + Edad + "]";
    }
    
    
}
