package control;

import logica.ParcialColor;
import presentacion.FParcial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParcialControlador {
    private ParcialColor colores;
    private FParcial vista;

    public ParcialControlador(ParcialColor modelo, FParcial vista) {
        this.colores = modelo;
        this.vista = vista;

        this.vista.btnCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarModelo("cuadrado");
            }
        });

        this.vista.btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarModelo("circulo");
            }
        });
    }

    private void actualizarModelo(String figura) {
        try {
            colores.setRojo(Integer.parseInt(vista.txtRojo.getText()));
            colores.setVerde(Integer.parseInt(vista.txtVerde.getText()));
            colores.setAzul(Integer.parseInt(vista.txtAzul.getText()));
            colores.setFigura(figura);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Por favor ingrese valores válidos.");
        }
    }
}