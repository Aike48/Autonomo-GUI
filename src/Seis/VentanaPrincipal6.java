package Seis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrincipal6 extends JFrame implements ActionListener {

    private JLabel etiNombre;
    private JButton btnEsquina;
    private JButton btnCentro;
    private JButton btnAgrandar;
    private JButton btnAchicar;

    public VentanaPrincipal6() {
        initComponents();
        setSize(500, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Ventana Principal 6");
    }

    private void initComponents() {
        etiNombre = new JLabel("Nombre");
        btnEsquina = new JButton("Esquina");
        btnCentro = new JButton("Centro");
        btnAgrandar = new JButton("Agrandar");
        btnAchicar = new JButton("Achicar");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        etiNombre.setOpaque(true);
        etiNombre.setBackground(Color.LIGHT_GRAY);
        etiNombre.setPreferredSize(new Dimension(100, 50));
        getContentPane().add(etiNombre);

        btnEsquina.setBounds(30, 30, 100, 30);
        btnCentro.setBounds(150, 30, 100, 30);
        btnAgrandar.setBounds(270, 30, 100, 30);
        btnAchicar.setBounds(390, 30, 100, 30);

        getContentPane().add(btnEsquina);
        getContentPane().add(btnCentro);
        getContentPane().add(btnAgrandar);
        getContentPane().add(btnAchicar);

        // --------------------------------
        btnEsquina.addActionListener(this);
        btnCentro.addActionListener(this);
        btnAgrandar.addActionListener(this);
        btnAchicar.addActionListener(this);

        // --------------------------------------
        addMouseListenerToButton(btnEsquina);
        addMouseListenerToButton(btnCentro);
        addMouseListenerToButton(btnAgrandar);
        addMouseListenerToButton(btnAchicar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEsquina) {

            etiNombre.setLocation(10, 10);
        } else if (e.getSource() == btnCentro) {

            int x = (getWidth() - etiNombre.getWidth()) / 2;
            int y = (getHeight() - etiNombre.getHeight()) / 2;
            etiNombre.setLocation(x, y);
        } else if (e.getSource() == btnAgrandar) {

            Dimension size = etiNombre.getPreferredSize();
            etiNombre.setPreferredSize(new Dimension(size.width + 20, size.height + 10));
            etiNombre.setSize(etiNombre.getPreferredSize());
        } else if (e.getSource() == btnAchicar) {

            Dimension size = etiNombre.getPreferredSize();
            if (size.width > 20 && size.height > 10) {
                etiNombre.setPreferredSize(new Dimension(size.width - 20, size.height - 10));
                etiNombre.setSize(etiNombre.getPreferredSize());
            }
        }
    }

    private void addMouseListenerToButton(JButton button) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setSize(button.getWidth() + 10, button.getHeight() + 5);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setSize(button.getWidth() - 10, button.getHeight() - 5);
            }
        });
    }

    public static void main(String[] args) {
            VentanaPrincipal6 miVentana = new VentanaPrincipal6();
            miVentana.setVisible(true);
    }
}
