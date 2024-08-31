package Cinco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrincipal5 extends JFrame {

    private JLabel etiPal1;
    private JLabel etiPal2;
    private JLabel etiPal3;
    private JLabel etiPal4;
    private JLabel etiOcultar;

    public VentanaPrincipal5() {
        initComponents();
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Ventana Principal 5");
    }

    private void initComponents() {
        etiPal1 = new JLabel("Palabra 1");
        etiPal2 = new JLabel("Palabra 2");
        etiPal3 = new JLabel("Palabra 3");
        etiPal4 = new JLabel("Palabra 4");
        etiOcultar = new JLabel("Ocultar");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);


        etiPal1.setBounds(30, 30, 100, 25);
        getContentPane().add(etiPal1);

        etiPal2.setBounds(30, 70, 100, 25);
        getContentPane().add(etiPal2);

        etiPal3.setBounds(30, 110, 100, 25);
        getContentPane().add(etiPal3);

        etiPal4.setBounds(30, 150, 100, 25);
        getContentPane().add(etiPal4);

        // Configuración de la etiqueta "Ocultar"
        etiOcultar.setBounds(200, 30, 100, 60);
        etiOcultar.setBackground(Color.YELLOW);
        etiOcultar.setOpaque(true);
        etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
        etiOcultar.setFont(new Font("Arial", Font.BOLD, 16));
        getContentPane().add(etiOcultar);

        //--------------------------
        etiOcultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ocultarPalabras();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mostrarPalabras();
            }
        });
    }

    private void ocultarPalabras() {
        etiPal1.setVisible(false);
        etiPal2.setVisible(false);
        etiPal3.setVisible(false);
        etiPal4.setVisible(false);
    }

    private void mostrarPalabras() {
        etiPal1.setVisible(true);
        etiPal2.setVisible(true);
        etiPal3.setVisible(true);
        etiPal4.setVisible(true);
    }

    public static void main(String[] args) {
            VentanaPrincipal5 miVentana = new VentanaPrincipal5();
            miVentana.setVisible(true);
    }
}

