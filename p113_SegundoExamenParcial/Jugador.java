package p113_SegundoExamenParcial;

public abstract class Jugador {
    public String Nombre;
    public char Sexo;
    private String Descripción;
    public double Salario;
    public double Total;

    public Jugador(String nombre, char sexo, String descripción, double salario) {
        Nombre = nombre;
        Sexo = sexo;
        Descripción = descripción;
        Salario = salario;
        Total = 0;
    }
     
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String descripción) {
        Descripción = descripción;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public abstract double getBono();

    public String toString() {
        
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripción=" + Descripción + ", Salario=" + Salario
                + ", Total=" + Total + "]";
    } 
}
