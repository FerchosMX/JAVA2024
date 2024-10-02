package p96_Empleado03;


    public class Empleado {
        // Propiedades
        private String Nombre;
        private int Edad;
        
        
        // Constructor
        public Empleado() {}
        public Empleado(String nombre, int edad){
            Nombre = nombre;
            Edad = edad;
        }
        
        
        // Métodos -- Source Action -> Getters and Setters
                
        public String getNombre() { 
            return Nombre;
        }
        public void setNombre(String nombre) {
            this.Nombre = nombre;
        }
        public int getEdad() {
            return Edad;
        }
        public void setEdad(int edad) {
            Edad = edad;
        }
    
        public String toString() {
            return "Empleado [nombre=" + Nombre + ", Edad=" + Edad + "]";
        }
        
}
