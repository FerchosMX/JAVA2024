import javax.swing.*;
import java.awt.*;

public class p140_HolaMundoGui extends JFrame {

    private JLabel lblSaludo;
    
    public p140_HolaMundoGui(){
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo");
        lblSaludo.setFont(new Font("Times New Roman", Font.BOLD+Font.ITALIC, 60));
        lblSaludo.setBounds(10, 20, 400, 40);
        add(lblSaludo);
        setTitle("Mi primer programa de interfaz gráfica en Java");
   }

   public static void main(String[] args) {
    p140_HolaMundoGui app = new p140_HolaMundoGui();

    app.setBounds(0,0,800,300);
    app.setLocal
   }
    
}
