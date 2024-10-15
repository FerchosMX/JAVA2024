package p108_Vehiculo;

public class Compacto {
    private int Serie, Año;
    private String marca;
    private float precio;
    public Compacto() {

    }
    public Compacto(int serie, int año, String marca, float precio) {
        Serie = serie;
        Año = año;
        this.marca = marca;
        this.precio = precio;
    }
    public int getSerie() {
        return Serie;
    }
    public void setSerie(int serie) {
        Serie = serie;
    }
    public int getAño() {
        return Año;
    }
    public void setAño(int año) {
        Año = año;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Compacto [Serie=" + Serie + ", Año=" + Año + ", marca=" + marca + ", precio=" + precio + "]";
    }
    
}
