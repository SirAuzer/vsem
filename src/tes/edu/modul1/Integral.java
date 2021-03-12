package tes.edu.modul1;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class Integral
 * @since 12.03.2021 - 19.02
 **/

public class Integral {

    public static double getArea(double start, double finish, int steps, int secant)
    {
        double area = 0;
        double step = (finish - start) / steps;

        double height = 0;
        for (double i = 0; i < steps; i ++)
        {
            if(Math.sin(i * step) < 0.1 * secant)
            {
                height = Math.sin(i * step);
            }
            else height = 0.1 * secant;

            double currentArea = height * step;
            area += currentArea;
        }

        return area;
    }

    public static void main(String[] args) {

        System.out.println("Area = " + getArea(0, Math.PI, 100, 8));

    }
}

/*
        Area = 1.829388059607393
*/
