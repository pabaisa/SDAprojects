package lt.sdacademy.advancefeatures.concurency.example6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExampleMain {
    // Maximum number of threads in thread pool
    static final int MAX_T=3;

    public static void main(String [] args){
        // creates five tasks
        Runnable r1 = new Task("task1");
        Runnable r2 = new Task("task2");
        Runnable r3 = new Task("task3");
        Runnable r4 = new Task("task4");
        Runnable r5 = new Task("task5");

        ExecutorService pool = Executors.newFixedThreadPool (MAX_T);

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        pool.shutdown();
    }
}
