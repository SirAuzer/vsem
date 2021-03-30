package tes.edu.module2.design;

import tes.edu.module2.Interface.IGeometry;

/**
 * @author Arenii
 * @version 1.0.0
 * @project vsem
 * @class Square
 * @since 30.03.2021 - 20.33
 **/

public class Square implements IGeometry {
    private int side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void showHeight() {
        System.out.println(side);
    }
}
