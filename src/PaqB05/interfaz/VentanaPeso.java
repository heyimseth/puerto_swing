package PaqB05.interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPeso extends JFrame {

    private JPanel panelPeso;
    private JLabel pesoLbl;
    private JButton cerrarBtn;

    public VentanaPeso(int peso) {
        setContentPane(panelPeso);
        setTitle("Peso Hubs");
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);
        setIconImage(new ImageIcon("src/PaqB05/interfaz/contenedores.png").getImage());
        this.pesoLbl.setText("El peso total del hub es: " + peso);
        setSize(300,300);
        cerrarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}
