package telran.frequency.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordFreqAppl {
    public static void main(String[] args) {
        List<String> words = List.of("aba","babab","caca","aba","apple","pineapple","apple","aba");
        words.stream()
                .collect(Collectors.groupingBy((t->t),Collectors.counting()))
                .entrySet()
                .forEach(entry -> System.out.println(entry.getKey()  + " -> " + entry.getValue()));
    }
}
