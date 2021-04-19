package tes.edu.finalTesting;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class Glossary
 * @since 19.04.2021 - 18.16
 **/

public class Glossary {
    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Hades\\Desktop\\harry.txt")));

        text = text.toLowerCase().replaceAll("[^A-Za-z ']", "");
        String[] words = text.split(" +");
        List<String> list = Arrays.stream(words).collect(Collectors.toList());
        Set<String> distincts = list.stream().collect(Collectors.toSet());


        Map<String, Integer> map = new HashMap<>();

        Integer value = 0;
        for (int i = 0; i < words.length; i++) {
            if(!map.containsKey(words[i])){
                map.put(words[i], 1);
            }
            else{
                value = map.get(words[i]);
                map.put(words[i], ++value);
            }
        }
        System.out.println("------------------Sort---------------");

        Map<String, Integer> sorted = new LinkedHashMap<>();


        map.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> sorted.put(entry.getKey(), entry.getValue()));


        String sorted20 = "================================\n" +
                "\tGLOSSARY\n" +
                "================================\n" +
                "--------------------------\n" +
                "\tTASK 1\n" +
                "--------------------------\n";
        int counter = 0;
        sorted.entrySet().stream().limit(20).forEach(System.out::println);

        for(Map.Entry<String, Integer> entry : sorted.entrySet()){
            counter++;
            sorted20 += entry.getKey() + " " + entry.getValue() + "\n";
            if(counter == 20) break;
        }

        String sortedToString = sorted.toString();
        Files.write(Paths.get("C:\\Users\\Hades\\Desktop\\FinalExams.txt"),
                sorted20.getBytes(StandardCharsets.UTF_8));

    }
}
