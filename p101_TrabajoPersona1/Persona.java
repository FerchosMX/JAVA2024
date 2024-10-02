package p101_TrabajoPersona1;

public class Persona {
    private String Nombre;
    private Trabajo Trabajo;
    public Persona() {
    }
    public Persona(String nombre, p101_TrabajoPersona1.Trabajo trabajo) {
        Nombre = nombre;
        Trabajo = trabajo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Trabajo getTrabajo() {
        return Trabajo;
    }
    public void setTrabajo(Trabajo trabajo) {
        Trabajo = trabajo;
    }
    @Override // Esto no es necesario pero no pasa nada si lo dejamos
    public String toString() {
        return "Persona [Nombre=" + Nombre + ", Trabajo=" + Trabajo + "]";
    }
    
}
