import javax.swing.*;
import java.awt.event.*;

public class p141_AreaTrianguloGUI extends JFrame{

    private JLabel lblBase, lblAltura, lblResultado;
    private JTextField txtBase, txtAltura;
    private JButton btnCalcular, btnSalir;


    public p141_AreaTrianguloGUI(){
        super("Calcualr el área de un triángulo");
        setLayout(null);
        lblBase = new JLabel("Base: ");
        lblBase.setBounds(10,20,200,30);
        add(lblBase);
    }

    public static void main(String[] args) {
        p141_AreaTrianguloGUI app = new p141_AreaTrianguloGUI();
        app.setBounds(0,0,300,200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCLoseOperation(EXIT_ON_CLOSE);

    }
    
}
