package tes.edu.module3.laboratoryWork2;

import tes.edu.module3.laboratoryWork2.Interface.IEfect;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class FreeChoice
 * @since 08.04.2021 - 02.59
 **/

public class FreeChoice implements IEfect {
    private boolean fitnessMachine;
    private boolean pool;
    private boolean yoga;
    private boolean medicalAdvisory;
    private boolean coach;
    private boolean storeСell;
    private TypeFitnessCentre type;
    private int numbersOfVisits;
    private int timeInDay;

    public FreeChoice() {
    }

    public FreeChoice(boolean fitnessMachine, boolean pool,
                      boolean yoga, boolean medicalAdvisory,
                      boolean coach, boolean storeСell,
                      TypeFitnessCentre type, int numbersOfVisits,
                      int timeInDay) {
        this.fitnessMachine = fitnessMachine;
        this.pool = pool;
        this.yoga = yoga;
        this.medicalAdvisory = medicalAdvisory;
        this.coach = coach;
        this.storeСell = storeСell;
        this.type = type;
        this.numbersOfVisits = numbersOfVisits;
        this.timeInDay = timeInDay;
    }

    public boolean isFitnessMachine() {
        return fitnessMachine;
    }

    public void setFitnessMachine(boolean fitnessMachine) {
        this.fitnessMachine = fitnessMachine;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isYoga() {
        return yoga;
    }

    public void setYoga(boolean yoga) {
        this.yoga = yoga;
    }

    public boolean isMedicalAdvisory() {
        return medicalAdvisory;
    }

    public void setMedicalAdvisory(boolean medicalAdvisory) {
        this.medicalAdvisory = medicalAdvisory;
    }

    public boolean isCoach() {
        return coach;
    }

    public void setCoach(boolean coach) {
        this.coach = coach;
    }

    public boolean isStoreСell() {
        return storeСell;
    }

    public void setStoreСell(boolean storeСell) {
        this.storeСell = storeСell;
    }

    public TypeFitnessCentre getType() {
        return type;
    }

    public void setType(TypeFitnessCentre type) {
        this.type = type;
    }

    public int getNumbersOfVisits() {
        return numbersOfVisits;
    }

    public void setNumbersOfVisits(int numbersOfVisits) {
        this.numbersOfVisits = numbersOfVisits;
    }

    public int getTimeInDay() {
        return timeInDay;
    }

    public void setTimeInDay(int timeInDay) {
        this.timeInDay = timeInDay;
    }

    @Override
    public String toString() {
        return "FreeChoice{" +
                "fitnessMachine=" + fitnessMachine +
                ", pool=" + pool +
                ", yoga=" + yoga +
                ", medicalAdvisory=" + medicalAdvisory +
                ", coach=" + coach +
                ", storeСell=" + storeСell +
                ", type=" + type +
                ", numbersOfVisits=" + numbersOfVisits +
                ", timeInDay=" + timeInDay +
                '}';
    }



    @Override
    public double PlusHP() {
        double HP = 10 * ((getNumbersOfVisits() * getTimeInDay()) / 7);
        HP += isFitnessMachine() ? 3 : 0;
        HP += isPool() ? 25 : 0;
        HP += isCoach() ? 7 : 0;
        HP += isYoga() ? 12 : 0;
        HP += isMedicalAdvisory() ? 50 : 0;
        HP *= (getType() == TypeFitnessCentre.PREMIUM) ? 1.2 : 1;
        HP *= (getType() == TypeFitnessCentre.ELITE) ? 1.3 : 1;
        HP *= (getType() == TypeFitnessCentre.VIP) ? 1.5 : 1;
        return HP;
    }

    @Override
    public double PriceOfMonth() {
        double price = 300 * getNumbersOfVisits() + (20 * getTimeInDay());
        price += isFitnessMachine() ? 150 : 0;
        price += isPool() ? 50 : 0;
        price += isCoach() ? 100 : 0;
        price += isYoga() ? 80 : 0;
        price += isMedicalAdvisory() ? 180 : 0;
        price += isStoreСell() ? 30 : 0;
        price *= (getType() == TypeFitnessCentre.LOW) ? 0.85 : 1;
        price *= (getType() == TypeFitnessCentre.PREMIUM) ? 1.3 : 1;
        price *= (getType() == TypeFitnessCentre.ELITE) ? 1.6 : 1;
        price *= (getType() == TypeFitnessCentre.VIP) ? 2 : 1;

        return price;
    }
}
