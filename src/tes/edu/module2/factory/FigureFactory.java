package tes.edu.module2.factory;

import tes.edu.module2.Interface.IGeometry;
import tes.edu.module2.design.IsoscelesTrapezoid;
import tes.edu.module2.design.Rectangle;
import tes.edu.module2.design.Square;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class TrapezoidFactory
 * @since 30.03.2021 - 20.30
 **/

public class FigureFactory {
    public static IGeometry create(int height){

        return new Square(height);
    }

    public static IGeometry create(int height, int weight){
        if(height == weight){
            return new Square(height);
        }
        return new Rectangle(height, weight);
    }

    public static IGeometry create(double lowerBase, double upperBase, double legsRight, double legsLeft ){
        if((upperBase + legsRight + legsLeft <= lowerBase) || (lowerBase + legsRight + legsLeft <= upperBase)){
            return null;
        }
        if(legsLeft == legsRight){
            return  new IsoscelesTrapezoid(lowerBase, upperBase, legsRight);
        }
        System.out.println("Trapezoid, but need Isosceles Trapezoid");
        return null; // return new Trapezoid(lowerBase, upperBase, legsRight, legsLeft)
    }
    public static IGeometry create(double a, Figures figure){
        if (figure.equals(Figures.SQUARE)) return  new Square((int) a);
        if (figure.equals(Figures.RECTANGLE)) return  new Rectangle((int) a,(int) a);
        return null;
    }

}
