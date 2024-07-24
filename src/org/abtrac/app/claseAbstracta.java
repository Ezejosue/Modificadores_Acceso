package org.abtrac.app;


import org.abtrac.app.figura.circulo;
import org.abtrac.app.figura.rectangulo;

public class claseAbstracta {
    public static void main(String[] args) {
        // figuraGeometrica fig = new figuraGeometrica();
        circulo c1 = new circulo();
        c1.dibujar();
        rectangulo r1 = new rectangulo();
        r1.dibujar();
    }
}
