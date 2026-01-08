package org.example.Head04_JCF.example07;

import java.util.HashMap;
import java.util.Map;

public class EntrySetBasicExample {
    public static void main(String[] args) {
        Map<String, Integer> capitals = new HashMap<>();
        capitals.put("Korea",82);
        capitals.put("Japan", 60);
        capitals.put("China", 89);
        capitals.put("USA", 72);
        capitals.put("Vietnam", 84);

        Map<String, String> num = new HashMap<>();
        num.put("Hyemin", "LIM");
        num.put("Ellen", "MISS");
        num.put("Phone", "Apple");


        for (Map.Entry<String, Integer> entry: capitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", capital: " + entry.getValue());
        }

        for (Map.Entry<String, String> entry:num.entrySet()){
            System.out.println("Name: "+entry.getKey() + " / LastName: "+entry.getValue());
        }


    }
}