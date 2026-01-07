package org.example.Head03_OOP.example18;

public class EnumBasicTest {
     public enum Level{
         LOW, MEDIUM, HIGH
     }

    public static void main(String[] args) {
        for (Level lvl : Level.values()){
            System.out.println(lvl + "original=" + lvl.ordinal());
        }
        Level today = Level.MEDIUM;
        System.out.println("name(): "+ today.name());
    }
}
