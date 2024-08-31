package Cuatro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal4 extends JFrame implements ActionListener {

    private JTextField txtNombre;
    private JTextField txtCiudad;
    private JLabel txtFrase;
    private JButton btnAceptar;
    private JButton btnDesactivar;
    private JButton btnActivar;
    private JPanel panelPrincipal;

    public VentanaPrincipal4() {
        initComponents();
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Datos del Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        panelPrincipal = new JPanel();
        txtNombre = new JTextField();
        txtCiudad = new JTextField();
        txtFrase = new JLabel();
        btnAceptar = new JButton("Aceptar");
        btnDesactivar = new JButton("Desactivar");
        btnActivar = new JButton("Activar");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panelPrincipal.setLayout(null);

        // ---------------------
        txtNombre.setBounds(50, 30, 300, 30);
        panelPrincipal.add(txtNombre);

        txtCiudad.setBounds(50, 70, 300, 30);
        panelPrincipal.add(txtCiudad);

        txtFrase.setBounds(50, 110, 300, 30);
        panelPrincipal.add(txtFrase);

        btnAceptar.setBounds(50, 150, 100, 30);
        panelPrincipal.add(btnAceptar);

        btnDesactivar.setBounds(160, 150, 100, 30);
        panelPrincipal.add(btnDesactivar);

        btnActivar.setBounds(270, 150, 100, 30);
        panelPrincipal.add(btnActivar);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(0, 0, 400, 300);

        // ----------------------------------
        btnAceptar.addActionListener(this);
        btnDesactivar.addActionListener(this);
        btnActivar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            aceptar();
        } else if (e.getSource() == btnDesactivar) {
            desactivar();
        } else if (e.getSource() == btnActivar) {
            activar();
        }
    }

    private void aceptar() {
        String nombre = txtNombre.getText();
        String ciudad = txtCiudad.getText();
        String frase = "Bienvenido/a " + nombre + " de " + ciudad + ".";
        txtFrase.setText(frase);
    }

    private void desactivar() {
        txtNombre.setEnabled(false);
        txtCiudad.setEnabled(false);
    }

    private void activar() {
        txtNombre.setEnabled(true);
        txtCiudad.setEnabled(true);
    }

    public static void main(String[] args) {
        VentanaPrincipal4 miVentana = new VentanaPrincipal4();
        miVentana.setVisible(true);
    }
}

