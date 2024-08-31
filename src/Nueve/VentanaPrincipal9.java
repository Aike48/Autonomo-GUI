package Nueve;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal9 extends JFrame implements ActionListener {

    private JTextField txtPalabra1;
    private JTextField txtPalabra2;
    private JButton btnConcatena;
    private JLabel etiTexto;

    public VentanaPrincipal9() {
        initComponents();
        setSize(300, 250);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Concatenar Palabras");
    }

    private void initComponents() {
        txtPalabra1 = new JTextField();
        txtPalabra2 = new JTextField();
        btnConcatena = new JButton("Concatena");
        etiTexto = new JLabel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtPalabra1.setBounds(30, 30, 150, 25);
        getContentPane().add(txtPalabra1);

        txtPalabra2.setBounds(30, 70, 150, 25);
        getContentPane().add(txtPalabra2);

        btnConcatena.setBounds(30, 110, 150, 25);
        getContentPane().add(btnConcatena);

        etiTexto.setBounds(30, 140, 300, 25);
        getContentPane().add(etiTexto);

        // -----------------------------------
        btnConcatena.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConcatena) {
            String palabra1 = txtPalabra1.getText();
            String palabra2 = txtPalabra2.getText();

            String resultado = palabra1 + palabra2;
            etiTexto.setText(resultado);
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal9 miVentana = new VentanaPrincipal9();
        miVentana.setVisible(true);
    }
}

