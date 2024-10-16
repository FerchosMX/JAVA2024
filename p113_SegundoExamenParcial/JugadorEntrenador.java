package p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador{
    private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripción, double salario, int subordinados,
            int proyectos) {
        super(nombre, sexo, descripción, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
        Total = salario + getBono();
    }

    public double getBono(){
        return (Salario*0.15)+(Proyectos*100)+(Subordinados*10);
    }

    public String toString() {
        return "\nJugadorEntrenador [Nombre="+getNombre()+ ", Sexo="+getSexo()+", Descripción= "+getDescripción()+", Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + ", Salario=" + Salario
                + ", Bono" + getBono() + ", Total= "+ Total + "]";
    }

    
    

}