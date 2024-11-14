package p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Juan Perez",18,'M', "Soltero","Delantero",20.0));
        datos.add(new Jugador("Maria Jimenez",20,'F',"Soltero","Delantero",50000.0));
        datos.add(new Jugador("Carlos Fuentes",27, 'M',"Casado","Portero",38000.0));
        return datos;
    }
    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) {
        try{ 
            FileOutputStream arch = new FileOutputStream(archivo);
            ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
            fpersonas.writeObject(datos);
            fpersonas.close();
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Error al serialiar los datos");
        }
    }

    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Jugador>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }
}

