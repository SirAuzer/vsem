package tes.edu.module2.factory;

import tes.edu.module2.design.IsoscelesTrapezoid;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class IsoscelesTrapezoidFactory
 * @since 30.03.2021 - 20.21
 **/

public class IsoscelesTrapezoidFactory {
    public static IsoscelesTrapezoid create(double lowerBase, double upperBase, double legs){
        if((upperBase + legs * 2 <= lowerBase) || (lowerBase + legs * 2 <= upperBase)){
            return null;
        }
        return  new IsoscelesTrapezoid(lowerBase, upperBase, legs);
    }
}
