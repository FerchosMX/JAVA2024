package p102_AutorLibro;

//GENERAR parametro vacio -> generar parametros -> generar toString -> generar getters and setters 

public class Autor {
    private String Nombre;
    private String Correo;
    private int Edad;
    public Autor() {
    }
    public Autor(String nombre, String correo, int edad) {
        Nombre = nombre;
        Correo = correo;
        Edad = edad;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    @Override
    public String toString() {
        return "Autor [Nombre=" + Nombre + ", Correo=" + Correo + ", Edad=" + Edad + "]";
    }

    
    
  

    
    
}
