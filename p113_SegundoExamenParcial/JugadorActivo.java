package p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador{
    private int Partidos;
    private int Goles;

    public JugadorActivo(String nombre, char sexo, String descripción, double salario, int partidos, int goles) {
        super(nombre, sexo, descripción, salario);
        Partidos = partidos;
        Goles = goles;
        Total = salario + getBono();
    }

    public double getBono(){
        return (Salario*0.10)+(Partidos*50)+(Goles*5);
    }

    public String toString() {
        return "\nJugadorActivo [Nombre= "+ getNombre() + ", Sexo="+getSexo()+ ", Descripción="+getDescripción()+", Partidos=" + Partidos + ", Goles=" + Goles + ", Salario=" + Salario +
                 ", Bono=" + getBono() + ", Total= " + Total +  "]";
    }
}
