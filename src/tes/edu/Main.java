package tes.edu;

import tes.edu.module2.design.IsoscelesTrapezoid;

public class Main {

    public static void main(String[] args) {
        System.out.println("Somebody once told me");
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
        trapezoid.setLegs(23);
        trapezoid.setLowerBase(45);
        trapezoid.setUpperBase(25);
        System.out.println(trapezoid.toString());

    }
}
