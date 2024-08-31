package Ocho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal8 extends JFrame implements ActionListener {

    private JTextField txtPrimerTrimestre;
    private JTextField txtSegundoTrimestre;
    private JTextField txtTercerTrimestre;
    private JLabel etiNotaFinal;
    private JLabel etiResultado;
    private JButton btnCalcular;

    public VentanaPrincipal8() {
        initComponents();
        setSize(400, 250);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Cálculo Nota Final");
    }

    private void initComponents() {
        txtPrimerTrimestre = new JTextField();
        txtSegundoTrimestre = new JTextField();
        txtTercerTrimestre = new JTextField();
        etiNotaFinal = new JLabel("Nota Final: ");
        etiResultado = new JLabel("Resultado: ");
        btnCalcular = new JButton("Calcular");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtPrimerTrimestre.setBounds(150, 20, 100, 25);
        txtSegundoTrimestre.setBounds(150, 60, 100, 25);
        txtTercerTrimestre.setBounds(150, 100, 100, 25);

        etiNotaFinal.setBounds(20, 140, 300, 25);
        etiResultado.setBounds(20, 170, 300, 25);

        btnCalcular.setBounds(150, 140, 100, 25);

        // --------------------------------
        getContentPane().add(new JLabel("Primer Trimestre:")).setBounds(20, 20, 120, 25);
        getContentPane().add(txtPrimerTrimestre);

        getContentPane().add(new JLabel("Segundo Trimestre:")).setBounds(20, 60, 120, 25);
        getContentPane().add(txtSegundoTrimestre);

        getContentPane().add(new JLabel("Tercer Trimestre:")).setBounds(20, 100, 120, 25);
        getContentPane().add(txtTercerTrimestre);

        getContentPane().add(etiNotaFinal);
        getContentPane().add(etiResultado);
        getContentPane().add(btnCalcular);

        // -------------------------
        btnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            try {
                // Obtener las notas de los cuadros de texto
                double primerTrimestre = Double.parseDouble(txtPrimerTrimestre.getText());
                double segundoTrimestre = Double.parseDouble(txtSegundoTrimestre.getText());
                double tercerTrimestre = Double.parseDouble(txtTercerTrimestre.getText());

                // Calcular la nota final
                double notaFinal = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3;

                // Mostrar la nota final
                etiNotaFinal.setText("Nota Final: " + String.format("%.2f", notaFinal));

                // Determinar el resultado
                if (notaFinal < 5) {
                    etiResultado.setText("Resultado: SUSPENSO");
                    etiNotaFinal.setForeground(Color.RED);
                    etiResultado.setForeground(Color.RED);
                } else {
                    etiResultado.setText("Resultado: APROBADO");
                    etiNotaFinal.setForeground(Color.BLACK);
                    etiResultado.setForeground(Color.BLACK);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, introduzca números válidos en todos los campos.");
            }
        }
    }

    public static void main(String[] args) {
            VentanaPrincipal8 miVentana = new VentanaPrincipal8();
            miVentana.setVisible(true);
    }
}
