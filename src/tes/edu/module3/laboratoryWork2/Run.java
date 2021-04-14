package tes.edu.module3.laboratoryWork2;

import tes.edu.module3.laboratoryWork2.Interface.IEfect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class Run
 * @since 08.04.2021 - 03.06
 **/

public class Run {
    public static void main(String[] args) {
        List<IEfect> fitnes = new ArrayList<>(
                Arrays.asList(
                        new MinSubscribtion(TypeFitnessCentre.ELITE, 3),
                        new MinSubscribtion(TypeFitnessCentre.MEDIUM, 2),
                        new MinSubscribtion(TypeFitnessCentre.VIP, 3),
                        new MinSubscribtion(TypeFitnessCentre.PREMIUM, 1),
                        new MinSubscribtion(TypeFitnessCentre.MEDIUM, 4),
                        new FreeChoice(true, false, false, false,
                                true, true, TypeFitnessCentre.ELITE, 3, 2 ),
                        new FreeChoice(false, true, true, false,
                                false, true, TypeFitnessCentre.LOW, 2, 3 ),
                        new FreeChoice(true, false, true, true,
                                true, true, TypeFitnessCentre.VIP, 2, 2 ),
                        new FreeChoice(false, false, true, false,
                                false, false, TypeFitnessCentre.MEDIUM, 3, 1 ),
                        new FreeChoice(true, true, false, false,
                                false, true, TypeFitnessCentre.PREMIUM, 4, 1 )
                )
        );

        double sumPriceTotal = fitnes.stream().mapToDouble(IEfect::PriceOfMonth).sum();
        System.out.println("Sum price of month for all program/subscribe : ");

        double sumPriceMinSubscribe = fitnes.stream()
                .filter(price -> price instanceof MinSubscribtion)
                .mapToDouble(IEfect::PriceOfMonth).sum();
        System.out.println("Sum price of month for all programs with min-price subscribe : ");


        double sumPriceFreeChoice = fitnes.stream()
                .filter(price -> price instanceof FreeChoice)
                .mapToDouble(IEfect::PriceOfMonth).sum();
        System.out.println("Sum price of month for all programs with free choice : ");


        double MaxPrice = fitnes.stream().mapToDouble(IEfect::PriceOfMonth).max().getAsDouble();
        System.out.println("Max price of month for program : ");



        double MaxEffect = fitnes.stream().mapToDouble(IEfect::PlusHP).max().getAsDouble();
        System.out.println("Max effect from going to the fitness centre : ");

        double MinEffect = fitnes.stream().mapToDouble(IEfect::PlusHP).min().getAsDouble();
        System.out.println("Min effect from going to the fitness centre : ");

        double avgPrice = fitnes.stream().mapToDouble(IEfect::PriceOfMonth).average().getAsDouble();
        System.out.println("Avg price of month for program : " + avgPrice);


        System.out.println("\n\t but.... \n");
        System.out.println("Subscribe/program with this price have effect : ");

        List<IEfect> effectWithAvgPrice = fitnes.stream()
                .filter(effect -> effect.PlusHP() < avgPrice + 200 && effect.PlusHP() > avgPrice - 200 )
                .collect(Collectors.toList());


        double avgPriceMinSubscribe = fitnes.stream()
                .filter(price -> price instanceof MinSubscribtion)
                .mapToDouble(IEfect::PriceOfMonth).average().getAsDouble();
        double avgPriceFreeChoice = fitnes.stream()
                .filter(price -> price instanceof FreeChoice)
                .mapToDouble(IEfect::PriceOfMonth).average().getAsDouble();

        if(avgPriceMinSubscribe > avgPriceFreeChoice){
            System.out.println("avg price for month min subscribe (" + avgPriceMinSubscribe + ")\n\t more expensive than \n " + avgPriceFreeChoice + ")");
        }
        else {
            System.out.println("avg price for month free choice (" + avgPriceFreeChoice + ")\n\t more expensive than \n MinSubscribe (" + avgPriceMinSubscribe + ")");

        }

    }
}
