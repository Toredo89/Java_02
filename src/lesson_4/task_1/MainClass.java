package lesson_4.task_1;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        List<String> words;
        words = Arrays.asList(
                "Audi", "Acura", "Aston Martin", "BMW", "Honda",
                "Chevrolet", "Cadillac", "Bugatti", "Dodge", "Ferrari",
                "Ford", "Honda", "GMC", "Jaguar", "Volkswagen",
                "Volkswagen", "Porsche", "Subaru", "Toyota", "Nissan"
        );
        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Часто встречаемые слова");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
