package tes.edu.module2.Inheritance;

import tes.edu.module2.design.Rectangle;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class Window
 * @since 21.03.2021 - 16.16
 **/

public class Window extends Rectangle {
    private int layers;
    private int thickness;
    private boolean isToning;
    private boolean isBroken;

    public Window() {
    }

    public Window(int layers, int thickness, boolean isToning, boolean isBroken) {
        this.layers = layers;
        this.thickness = thickness;
        this.isToning = isToning;
        this.isBroken = isBroken;
    }

    public Window(int length, int weight, int layers, int thickness, boolean isToning, boolean isBroken) {
        super(length, weight);
        this.layers = layers;
        this.thickness = thickness;
        this.isToning = isToning;
        this.isBroken = isBroken;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public boolean isToning() {
        return isToning;
    }

    public void setToning(boolean toning) {
        isToning = toning;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public double getPrice(){
        double price = super.getLength() * super.getWeight();
        if(isToning) {
            price *= 4;
            if (isBroken) {
                return price / 2;
            }
            return price;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Window { " +
                "layers = " + layers +
                ", thickness = " + thickness +
                ", isToning = " + isToning +
                ", isBroken = " + isBroken +
                '}';
    }

    public void toConsole(){
        System.out.println(super.toString());
        System.out.println(this.toString());
    }
}
