package Siete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal7 extends JFrame implements ActionListener {

    private JLabel etiTexto;
    private JButton btnAzul;
    private JButton btnRojo;
    private JButton btnVerde;
    private JButton btnFondoAzul;
    private JButton btnFondoRojo;
    private JButton btnFondoVerde;
    private JButton btnTransparente;
    private JButton btnOpaca;

    public VentanaPrincipal7() {
        initComponents();
        setSize(600, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Ventana Principal 7");
    }

    private void initComponents() {
        etiTexto = new JLabel("Texto de ejemplo");
        btnAzul = new JButton("Azul");
        btnRojo = new JButton("Rojo");
        btnVerde = new JButton("Verde");
        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoVerde = new JButton("Fondo Verde");
        btnTransparente = new JButton("Transparente");
        btnOpaca = new JButton("Opaca");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        etiTexto.setOpaque(true);
        etiTexto.setBackground(Color.WHITE); // Fondo inicial blanco
        etiTexto.setPreferredSize(new Dimension(200, 50));
        etiTexto.setBounds(50, 50, 500, 50);
        getContentPane().add(etiTexto);

        btnAzul.setBounds(50, 120, 100, 30);
        btnRojo.setBounds(160, 120, 100, 30);
        btnVerde.setBounds(270, 120, 100, 30);
        btnFondoAzul.setBounds(50, 160, 100, 30);
        btnFondoRojo.setBounds(160, 160, 100, 30);
        btnFondoVerde.setBounds(270, 160, 100, 30);
        btnTransparente.setBounds(50, 200, 100, 30);
        btnOpaca.setBounds(160, 200, 100, 30);

        getContentPane().add(btnAzul);
        getContentPane().add(btnRojo);
        getContentPane().add(btnVerde);
        getContentPane().add(btnFondoAzul);
        getContentPane().add(btnFondoRojo);
        getContentPane().add(btnFondoVerde);
        getContentPane().add(btnTransparente);
        getContentPane().add(btnOpaca);

        // --------------------------------------------
        btnAzul.addActionListener(this);
        btnRojo.addActionListener(this);
        btnVerde.addActionListener(this);
        btnFondoAzul.addActionListener(this);
        btnFondoRojo.addActionListener(this);
        btnFondoVerde.addActionListener(this);
        btnTransparente.addActionListener(this);
        btnOpaca.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAzul) {
            etiTexto.setForeground(Color.BLUE);
        } else if (e.getSource() == btnRojo) {
            etiTexto.setForeground(Color.RED);
        } else if (e.getSource() == btnVerde) {
            etiTexto.setForeground(Color.GREEN);
        } else if (e.getSource() == btnFondoAzul) {
            etiTexto.setBackground(Color.BLUE);
        } else if (e.getSource() == btnFondoRojo) {
            etiTexto.setBackground(Color.RED);
        } else if (e.getSource() == btnFondoVerde) {
            etiTexto.setBackground(Color.GREEN);
        } else if (e.getSource() == btnTransparente) {
            etiTexto.setOpaque(false);
        } else if (e.getSource() == btnOpaca) {
            etiTexto.setOpaque(true);
        }
    }

    public static void main(String[] args) {
            VentanaPrincipal7 miVentana = new VentanaPrincipal7();
            miVentana.setVisible(true);
    }
}

