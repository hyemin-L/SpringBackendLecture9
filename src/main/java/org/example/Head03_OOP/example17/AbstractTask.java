package org.example.Head03_OOP.example17;

public abstract class AbstractTask {
    public abstract void execute();
    public void start() {
        System.out.println("Task 시작 수정했습니다");
    }
}
