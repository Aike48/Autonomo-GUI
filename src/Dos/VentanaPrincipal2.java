package Dos;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal2 extends JFrame implements ActionListener {

    private JTextField txtTexto;
    private JLabel etiTexto1;
    private JLabel etiTexto2;
    private JButton btnTraspasa1;
    private JButton btnTraspasa2;

    public VentanaPrincipal2() {
        initComponents();
        setSize(400, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Traspasar Texto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        txtTexto = new JTextField();
        etiTexto1 = new JLabel();
        etiTexto2 = new JLabel();
        btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa2 = new JButton("Traspasa 2");

        setLayout(null);

        // -------------------------------------
        txtTexto.setBounds(50, 30, 300, 25);
        add(txtTexto);

        etiTexto1.setBounds(50, 70, 300, 25);
        etiTexto1.setBorder(new EmptyBorder(10, 20, 10, 20));
        add(etiTexto1);

        etiTexto2.setBounds(230, 70, 300, 25);
        etiTexto2.setBorder(new EmptyBorder(10, 20, 10, 20));
        add(etiTexto2);

        btnTraspasa1.setBounds(50, 100, 120, 25);
        add(btnTraspasa1);

        btnTraspasa2.setBounds(230, 100, 120, 25);
        add(btnTraspasa2);

        // --------------------
        btnTraspasa1.addActionListener(this);
        btnTraspasa2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTraspasa1) {
            etiTexto1.setText(txtTexto.getText());
        } else if (e.getSource() == btnTraspasa2) {
            etiTexto2.setText(txtTexto.getText());
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal2 miVentana = new VentanaPrincipal2();
        miVentana.setVisible(true);
        };

}

