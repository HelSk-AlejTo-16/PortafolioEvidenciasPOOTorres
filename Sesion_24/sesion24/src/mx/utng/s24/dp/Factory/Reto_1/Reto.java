package mx.utng.s24.dp.Factory.Reto_1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Reto extends JFrame {

    private JTextField txtNum1;
    private JTextField txtNum2;

    /**
     * 
     */
    public Reto() {
        super("Suma");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(300, 150);

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(3, 2));

        JLabel lblNum1 = new JLabel("Numero 1 ");
        JLabel lblNum2 = new JLabel("Numero 2 ");

        txtNum1 = new JTextField();
        txtNum2 = new JTextField();

        JButton btnSuma = new JButton("Sumar");

        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
               
                 try {
                    double num1 = Double.parseDouble(txtNum1.getText());
                    double num2 = Double.parseDouble(txtNum2.getText());
                    double suma = num1 + num2;
                    JOptionPane.showMessageDialog(Reto.this, "El resultado de la suma es: " + suma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Reto.this, "Por favor, ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
           
              
            });

        
        panel.add(lblNum1);
        panel.add(txtNum1);
        panel.add(lblNum2);
        panel.add(txtNum2);
        panel.add(btnSuma);

        add(panel);

        setVisible(true);

        setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        new Reto();
    }

    

    

    
    
}
