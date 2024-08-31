package Tres;

import javax.swing.*;
import java.awt.event.*;

public class VentanaPrincipal3 extends JFrame {

    private JTextField txtTexto;
    private JLabel etiTexto;
    private JButton btnVaciar;

    public VentanaPrincipal3() {
        initComponents();
        setSize(400, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Ejemplo de Eventos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        setLayout(null);

        // --------------------------
        txtTexto = new JTextField();
        add(txtTexto);
        txtTexto.setBounds(50, 30, 300, 30);

        etiTexto = new JLabel();
        add(etiTexto);
        etiTexto.setBounds(50, 70, 300, 30);

        btnVaciar = new JButton("Vaciar");
        btnVaciar.setBounds(150, 120, 100, 30);
        add(btnVaciar);

        // -------------------------------

        txtTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                etiTexto.setText(txtTexto.getText());
            }
        });

        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTexto.setText("");
                etiTexto.setText("");
            }
        });
    }

    public static void main(String[] args) {
        VentanaPrincipal3 miVentana = new VentanaPrincipal3();
        miVentana.setVisible(true);
    }
}


