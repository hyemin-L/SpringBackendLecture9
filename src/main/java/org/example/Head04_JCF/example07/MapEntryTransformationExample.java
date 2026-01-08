package org.example.Head04_JCF.example07;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {
        Map<String, String> name = new HashMap<>();
        name.put("LIM", "hyemin");
        name.put("KIM", "heoju");
        name.put("PARK", "jisung");
        name.put("HYUN", "minho");

        Function<Map.Entry<String, String>, String> entryToString = new Function<Map.Entry<String, String>, String>() {
            @Override
            public String apply(Map.Entry<String, String> e){
                String a = e.getKey() + ", " + e.getValue();
                return a.toUpperCase();

            }

        };
        name.entrySet().stream()
                .map(entryToString)
                .forEach(result -> System.out.println("Student name: " + result));

    }
}
