package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import logica.ParcialColor;

public class PParcial extends JPanel implements Observer {
    private ParcialColor colores;

    public PParcial(ParcialColor colores) {
        this.colores = colores;
        this.colores.addObserver(this);
        setBackground(Color.WHITE);
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (colores.getFigura().isEmpty()) return;

        Color color = new Color(colores.getRojo(), colores.getVerde(), colores.getAzul());
        g.setColor(color);

        if (colores.getFigura().equals("cuadrado")) {
            g.fillRect(50, 50, 100, 100);
        } else if (colores.getFigura().equals("circulo")) {
            g.fillOval(50, 50, 100, 100);
        }
    }
}
