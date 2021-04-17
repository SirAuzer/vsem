package tes.edu.module4.multiThreading;

import java.io.IOException;
import java.time.LocalDate;

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
        System.out.println(this.getName() + " has been started");
        try {
            LogsService.getLogsCountByDate(this.getDate());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(this.getName() + " has been finished");

    }
}
