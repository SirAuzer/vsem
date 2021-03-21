package tes.edu.module2.design;

import java.util.Objects;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class IsoscelesTrapezoid
 * @since 21.03.2021 - 15.55
 **/

public class IsoscelesTrapezoid {
    double lowerBase; //
    double upperBase; //
    double legs;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(double lowerBase, double upperBase, double legs) {
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.legs = legs;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(double lowerBase) {
        this.lowerBase = lowerBase;
    }

    public double getUpperBase() {

        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getLegs() {
        return legs;
    }

    public void setLegs(double legs) {
        this.legs = legs;
    }

    public double getHeight() {

        return Math.sqrt(Math.pow(legs, 2) - (Math.pow((lowerBase - upperBase), 2) / 4));
    }

    public double getArea() {
        return (((lowerBase + upperBase) / 2) * getHeight());
    }

    public double getPerimeter() {
        return lowerBase + upperBase + legs * 2;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(legs, 2) + lowerBase * upperBase);
    }

    public double getMiddleLine() {
        return (lowerBase + upperBase) / 2;
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{" +
                "lowerBase=" + lowerBase +
                ", upperBase=" + upperBase +
                ", legs=" + legs + " } \n" +
                "\tArea = " + getArea() +
                ", Perimeter = " + getPerimeter() +
                ", Height = " + getHeight() +
                ", Diagonal = " + getDiagonal() +
                ", Middle line = " + getMiddleLine() + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsoscelesTrapezoid that = (IsoscelesTrapezoid) o;
        return Double.compare(that.lowerBase, lowerBase) == 0 && Double.compare(that.upperBase, upperBase) == 0 && Double.compare(that.legs, legs) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lowerBase, upperBase, legs);
    }
}
