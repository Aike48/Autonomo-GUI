package Uno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanPrincipal extends JFrame implements ActionListener {

    private JLabel etiNombre;
    private JTextField txtNombre;
    private JLabel etiCiudad;
    private JTextField txtCiudad;
    private JButton btnOcultarNombre;
    private JButton btnVisuNombre;
    private JButton btnOcultarCiudad;
    private JButton btnVisuCiudad;
    private JPanel panelRegistro;

    public VentanPrincipal(){
        initComponents();
        setSize(705, 330);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Pruebas");
    }

    private void initComponents(){
        panelRegistro = new JPanel();
        etiNombre = new JLabel("Nombre:");
        txtNombre = new JTextField();
        etiCiudad = new JLabel("Ciudad:");
        txtCiudad = new JTextField();
        btnOcultarNombre = new JButton("Ocultar Nombre");
        btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnVisuNombre = new JButton("Visualizar Nombre");
        btnVisuCiudad = new JButton("Visualizar Ciudad");

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        panelRegistro.setLayout(null);

        // ---------------------
        etiNombre.setBounds(30, 30, 80, 25);
        panelRegistro.add(etiNombre);

        txtNombre.setBounds(120, 30, 150, 25);
        panelRegistro.add(txtNombre);

        etiCiudad.setBounds(30, 70, 80, 25);
        panelRegistro.add(etiCiudad);

        txtCiudad.setBounds(120, 70, 150, 25);
        panelRegistro.add(txtCiudad);

        btnOcultarNombre.setBounds(30, 110, 150, 25);
        panelRegistro.add(btnOcultarNombre);

        btnVisuNombre.setBounds(190, 110, 150, 25);
        panelRegistro.add(btnVisuNombre);

        btnOcultarCiudad.setBounds(30, 150, 150, 25);
        panelRegistro.add(btnOcultarCiudad);

        btnVisuCiudad.setBounds(190, 150, 150, 25);
        panelRegistro.add(btnVisuCiudad);

        getContentPane().add(panelRegistro);
        panelRegistro.setBounds(0, 0, 690, 300);

        // ----------------------------------
        btnOcultarNombre.addActionListener(this);
        btnVisuNombre.addActionListener(this);
        btnOcultarCiudad.addActionListener(this);
        btnVisuCiudad.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnOcultarNombre){
            ocultarNombre();
        } else if (e.getSource() == btnOcultarCiudad) {
            ocultarCiudad();
        } else if (e.getSource() == btnVisuCiudad) {
            visualizarCiudad();
        } else if (e.getSource() == btnVisuNombre) {
            visualizarNombre();
        }
    }

    private void ocultarNombre(){
        txtNombre.setVisible(false);
    }

    private void ocultarCiudad(){
        txtCiudad.setVisible(false);
    }

    private void visualizarNombre(){
        txtNombre.setVisible(true);
    }

    private void visualizarCiudad(){
        txtCiudad.setVisible(true);
    }
}
