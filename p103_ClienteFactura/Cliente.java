package p103_ClienteFactura;

public class Cliente{
    private int Id;
    private String nombre;
    private float Descuento;
    public Cliente() {

    }
    public Cliente(int id, String nombre, float descuento) {
        Id = id;
        this.nombre = nombre;
        Descuento = descuento;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getDescuento() {
        return Descuento;
    }
    public void setDescuento(float descuento) {
        Descuento = descuento;
    }
    @Override
    public String toString() {
        return "Cliente [Id=" + Id + ", nombre=" + nombre + ", Descuento=" + Descuento + "]";
    }
}