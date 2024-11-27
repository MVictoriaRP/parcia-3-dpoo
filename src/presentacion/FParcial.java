package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.ParcialColor;

public class FParcial extends JFrame {
    
	public JTextField txtRojo, txtVerde, txtAzul;
    public JButton btnCuadrado, btnCirculo;
    public JPanel pParcial;

    public FParcial(ParcialColor colores) {
        setTitle("Parcial Manuela Victoria Ragua");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelControles = new JPanel();
        panelControles.setLayout(new GridLayout(4, 2, 5, 5));
        
        panelControles.add(new JLabel("R"));
        txtRojo = new JTextField("100");
        panelControles.add(txtRojo);

        panelControles.add(new JLabel("G"));
        txtVerde = new JTextField("100");
        panelControles.add(txtVerde);

        panelControles.add(new JLabel("B"));
        txtAzul = new JTextField("100");
        panelControles.add(txtAzul);

        btnCuadrado = new JButton("Cuadrado");
        btnCirculo = new JButton("Circulo");
        panelControles.add(btnCuadrado);
        panelControles.add(btnCirculo);

        add(panelControles, BorderLayout.WEST);

        pParcial = new PParcial(colores);
        add(pParcial, BorderLayout.CENTER);
    }
}
