package tes.edu.module2.design;

import tes.edu.module2.Interface.IGeometry;

import java.util.Objects;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class Rectangle
 * @since 21.03.2021 - 16.05
 **/

public class Rectangle implements IGeometry {
    private int length;
    private int weight;

    public Rectangle() {
    }

    public Rectangle(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Rectangle{ " +
                "length=" + length +
                ", width=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && weight == rectangle.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, weight);
    }

    @Override
    public double getPerimeter() {
        return (getLength() + getWeight()) * 2;
    }

    @Override
    public double getArea() {
        return getLength() * getWeight();
    }

    @Override
    public void showHeight() {
        System.out.println(getLength());
    }
}
