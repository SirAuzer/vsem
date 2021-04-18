package tes.edu.module4.multiThreading;

import tes.edu.module4.LogService;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class RunTread
 * @since 17.04.2021 - 23.49
 **/

public class RunTread {
    public static void main(String[] args) throws IOException {


        LocalDateTime start = LocalDateTime.now();

        LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 20);

        for(int i =0; i < 5; i++){
           // System.out.println(i + " - ");
            LogsService.getLogsCountByDate(date.plusDays(i));
        }
        LocalDateTime finish = LocalDateTime.now();

        System.out.println("Threads TIME = " + ChronoUnit.MILLIS.between(start, finish) + " msec.");

        System.out.println("---------------------------------- threads -----------------------");
        for (int i = 0; i < 5; i++) {
            new MyThread(date.plusDays(i)).start();
        }
    }


}
