package org.example.Head03_OOP.example07;

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "Alice", "alice@example.com");
        u.printUserInfo();

        User c = new BusinessUser("U002","Big Show", "bigshow@gmail.com", "WWE");
        c.printUserInfo();
    }
}