package telran.frequency.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DigitsFreqAppl {
    private static final int N_NUMBERS=1_000_000;
    public static void main(String[] args){

        getRandomNumbers(N_NUMBERS,0,Integer.MAX_VALUE)
                .stream()
                .flatMap(Integer -> Arrays.stream(Integer.toString().split("")))
                .collect(Collectors.groupingBy(t -> t,Collectors.counting()))
                .entrySet()
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
    private static List<Integer> getRandomNumbers(int amount, int min, int max) {
        return new Random().ints(min, max)
                .limit(amount)
                .boxed()
                .collect(Collectors.toList());
    }
}
