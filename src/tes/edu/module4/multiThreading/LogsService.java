package tes.edu.module4.multiThreading;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class LogsService
 * @since 17.04.2021 - 23.48
 **/

public class LogsService {
    private final String file = "C:\\Users\\Hades\\Desktop\\logs.txt";

    public LogsService() {
    }



    public String getFile() {
        return file;
    }


    // 2021-03-11
    public static List<String> logsByDate(String file, LocalDate date) throws IOException {
        String dateAsString = date.toString();

        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .collect(Collectors.toList());

        return list;
    }

    public static void getLogsCountByDate(LocalDate date) throws IOException {
        String dateAsString = date.toString();
        String file = "C:\\Users\\Hades\\Desktop\\logs.txt";

        System.out.println(date + " - " + Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString)).count() + '.');
    }

    public static void logsByDateToFile(String file, LocalDate date) throws IOException {

        String dateAsString = date.toString();
        String str = "";
        StringBuilder sb = new StringBuilder(str);
        Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .forEach(log -> sb.append(log + '\n'));

        String fileOutput = "C:\\Users\\Hades\\Desktop\\" +  "ERROR" + dateAsString + ".log";
        Files.write(Paths.get(fileOutput), sb.toString().getBytes(StandardCharsets.UTF_8));

    }
}
