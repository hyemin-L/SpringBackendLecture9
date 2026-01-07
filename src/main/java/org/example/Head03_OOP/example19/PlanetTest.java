package org.example.Head03_OOP.example19;

public class PlanetTest {
    public static void main(String[] args) {
        for(Planet planet : Planet.values()){
            System.out.println("Planet: " + planet.toString());
            System.out.println("Planet's Name : " + planet.toStringName());
            System.out.println("surfaceGravity: " + planet.surfaceGravity());
        }
    }
}
