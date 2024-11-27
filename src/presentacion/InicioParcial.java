package presentacion;

import control.ParcialControlador;
import logica.ParcialColor;

public class InicioParcial {
    public static void main(String[] args) {
        ParcialColor colores = new ParcialColor(100, 100, 100);
        FParcial vista = new FParcial(colores);
        new ParcialControlador(colores, vista);

        vista.setVisible(true);
    }
}
