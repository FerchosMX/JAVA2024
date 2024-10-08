package p107_Forma;

public class Forma {
    private String color;

    public Forma(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();
    
}
