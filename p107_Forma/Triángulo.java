package p107_Forma;

public class Triángulo extends Forma{
    private double Base;
    private double Altura;
    
    public Triángulo(String color, double base, double altura) {
        super(color);
        Base = base;
        Altura = altura;
    }

    public double getBase() {
        return Base;
    }
    public void setBase(double base) {
        Base = base;
    }
    public double getAltura() {
        return Altura;
    }
    public void setAltura(double altura) {
        Altura = altura;
    }

    public double getArea(){
        return(Base*Altura)/2;
    }

    @Override
    public String toString() {
        return "Triángulo Base=" + Base + ", Altura=" + Altura + ", getArea()"+getArea()+"";
    }    

    
    
}
