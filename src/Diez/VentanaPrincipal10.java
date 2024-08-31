package Diez;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal10 extends JFrame {

    private JLabel[] etiquetas;
    private JTextField txtNumero;
    private JButton btnBorrar;

    public VentanaPrincipal10() {
        initComponents();
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Etiquetas y Cuadro de Texto");
    }

    private void initComponents() {
        etiquetas = new JLabel[10];
        txtNumero = new JTextField();
        btnBorrar = new JButton("Borrar");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // -------------------------
        for (int i = 0; i < 10; i++) {
            etiquetas[i] = new JLabel(String.valueOf(i));
            etiquetas[i].setBounds(30 + i * 30, 30, 30, 30);
            getContentPane().add(etiquetas[i]);

            // ------------------------------
            final int numero = i;
            etiquetas[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    txtNumero.setText(txtNumero.getText() + numero);
                }
            });
        }

        // Cuadro de texto
        txtNumero.setBounds(30, 70, 300, 30);
        txtNumero.setEditable(false);
        getContentPane().add(txtNumero);

        // Botón Borrar
        btnBorrar.setBounds(30, 110, 100, 30);
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumero.setText("");
            }
        });
        getContentPane().add(btnBorrar);
    }

    public static void main(String[] args) {
        VentanaPrincipal10 miVentana = new VentanaPrincipal10();
        miVentana.setVisible(true);
    }
}
