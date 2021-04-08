package tes.edu.module3.laboratoryWork2;

import tes.edu.module3.testLaboratory2.FreeChoiceT;
import tes.edu.module3.testLaboratory2.Interface.IAccounting;
import tes.edu.module3.testLaboratory2.MinSubscribtionT;
import tes.edu.module3.testLaboratory2.TypeFitnessCentreT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Hades
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

        double sumPriceMinSubscribe = fitnes.stream()
                .filter(price -> price instanceof MinSubscribtion)
                .mapToDouble(IEfect::PriceOfMonth).sum();

        double sumPriceFreeChoice = fitnes.stream()
                .filter(price -> price instanceof FreeChoice)
                .mapToDouble(IEfect::PriceOfMonth).sum();

        double MaxPrice = fitnes.stream().mapToDouble(IEfect::PriceOfMonth).max().getAsDouble();


       double MaxEffect = fitnes.stream().mapToDouble(IEfect::PlusHP).max().getAsDouble();
        double MinEffect = fitnes.stream().mapToDouble(IEfect::PlusHP).min().getAsDouble();


        double avgPrice = fitnes.stream().mapToDouble(IEfect::PriceOfMonth).average().getAsDouble();
        //but effect
        /*double MaxEffect = fitnes.stream()
                .filter(effect -> effect.PlusHP() < avgPrice + )
                .collect(Collectors.toList());
*/

        double avgPriceMinSubscribe = fitnes.stream()
                .filter(price -> price instanceof MinSubscribtion)
                .mapToDouble(IEfect::PriceOfMonth).average().getAsDouble();
        double avgPriceFreeChoice = fitnes.stream()
                .filter(price -> price instanceof FreeChoice)
                .mapToDouble(IEfect::PriceOfMonth).average().getAsDouble();

    }
}
