package tes.edu.module3.laboratoryWork2;

import tes.edu.module3.testLaboratory2.TypeFitnessCentreT;

/**
 * @author Hades
 * @version 1.0.0
 * @project vsem
 * @class MinSubscribtion
 * @since 08.04.2021 - 01.09
 **/

public class MinSubscribtion implements IEfect {
    final int numberOfVisits = 2;
    private TypeFitnessCentre type;
    private int timeInDay;

    public MinSubscribtion() {
    }

    public MinSubscribtion(TypeFitnessCentre type, int timeInDay) {
        this.type = type;
        this.timeInDay = timeInDay;
    }

    public int getNumberOfVisits() {
        return numberOfVisits;
    }

    public TypeFitnessCentre getType() {
        return type;
    }

    public void setType(TypeFitnessCentre type) {
        this.type = type;
    }

    public int getTimeInDay() {
        return timeInDay;
    }

    public void setTimeInDay(int timeInDay) {
        this.timeInDay = timeInDay;
    }

    @Override
    public String toString() {
        return "MinSubscribtion{" +
                "numberOfVisits=" + numberOfVisits +
                ", type=" + type +
                ", timeInDay=" + timeInDay +
                '}';
    }


    @Override
    public double PlusHP() {
        double HP = 10 * (( 2 * getTimeInDay()) / 7);
        HP *= (getType() == TypeFitnessCentre.PREMIUM) ? 1.05 : 1;
        HP *= (getType() == TypeFitnessCentre.ELITE) ? 1.2 : 1;
        HP *= (getType() == TypeFitnessCentre.VIP) ? 1.35 : 1;
        return HP;
    }

    @Override
    public double PriceOfMonth() {
        int price = 300 * getNumberOfVisits() + (20 * getTimeInDay());
        price *= (getType() == TypeFitnessCentre.LOW) ? 0.85 : 1;
        price *= (getType() == TypeFitnessCentre.PREMIUM) ? 1.3 : 1;
        price *= (getType() == TypeFitnessCentre.ELITE) ? 1.6 : 1;
        price *= (getType() == TypeFitnessCentre.VIP) ? 2 : 1;
        return price;
    }
}
