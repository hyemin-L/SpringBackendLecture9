package org.example.Head04_JCF.example07;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNamesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Function<String, String> nameLength = new Function<String, String>() {
            @Override
            public String apply(String s){
                return s.toUpperCase();
            }

        };

        names.stream()
                .map(nameLength)
                .forEach(length -> System.out.println("Name legnth: " + length));
    }
}