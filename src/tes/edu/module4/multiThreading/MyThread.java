package tes.edu.module4.multiThreading;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class MyThread
 * @since 17.04.2021 - 23.48
 **/

public class MyThread extends Thread{

    private LocalDate date;

    public MyThread(LocalDate date){
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public void run() {
        LocalDateTime start = LocalDateTime.now();

        System.out.println(this.getName() + " has been started at: " + start + '.');
        try {
            LogsService.getLogsCountByDate(this.getDate());
        } catch (IOException e) {
            e.printStackTrace();
        }

        LocalDateTime finish = LocalDateTime.now();

        System.out.println(this.getName() + " has been finished at: " + finish + '.');
        System.out.println(this.getName() + " duration is - " +
                ChronoUnit.MILLIS.between(start, finish));

    }
}
