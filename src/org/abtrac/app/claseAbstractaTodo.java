package org.abtrac.app;

public class claseAbstractaTodo {
    public static void main(String[] args) {
        //figuraGeometrica figuraGeometrica = new FiguraGeometrica();
        figuraGeometrica figuraGeometrica = new rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new circulo();
        figuraGeometrica.dibujar();
    }


}

abstract class figuraGeometrica {
    public abstract void dibujar();
}

class circulo extends figuraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Dibujar circulo");
    }
}

class rectangulo extends figuraGeometrica {

    @Override
    public void dibujar() {
        System.out.println("Dibujar rectangulo");
    }
}
