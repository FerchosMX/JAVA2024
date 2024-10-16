package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;
    
    public Equipo() {
    }

    public Equipo(String nombre, String liga) {
        Jugadores = new ArrayList<>();
        Nombre = nombre;
        Liga = liga;
    }


    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void agregarJugador(Jugador Jugador){
        Jugadores.add(Jugador);
    }

    public double getTotalBono(){
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono = totalBono + jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal(){
    double total = 0;      
    for (Jugador jugador : Jugadores) {
        total = total + jugador.getSalario() + jugador.getBono();
        }
        return total;
    }

    public int getTotalMujeres(){
        int totalMujeres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    public int getTotalHombres(){
        int totalHombres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }


    public void reporte(){
        System.out.println("\n>> Equipo: [" +"Nombre="+ Nombre + ", Liga= " + Liga + ", Jugadores=0" + ", Bono=0" + ", Total=0"+ ", Hombres=0"+ ", Mujeres=0"+ "]\n");
        System.out.println("\n>> Equipo: [" +"Nombre="+ Nombre + ", Liga= " + Liga + ", Jugadores=" + Jugadores.size()+ ", Bono=" + getTotalBono() + ", Total="+getTotal()+ ", Hombres= "+ getTotalHombres() + ", Mujeres= "+getTotalMujeres()+ "]\n");
        for (Jugador jugador : Jugadores) {
            System.out.println(jugador);
            }
        }


    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size() + "]";
    }
}
