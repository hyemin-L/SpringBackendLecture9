package org.example.Head03_OOP.example14;

public class LocalClassDemo {
    public void executeTask(){
        final int taskID = 999;

        class LocalWorker{
            public void run(){
                System.out.println("LocalWorker started with taskId = " + taskID);
            }
        }
        LocalWorker worker = new LocalWorker();
        worker.run();

    }

    public static void main(String[] args) {
        LocalClassDemo demo = new LocalClassDemo();
        demo.executeTask();
    }
}
