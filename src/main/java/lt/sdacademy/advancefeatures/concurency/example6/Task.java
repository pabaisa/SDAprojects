package lt.sdacademy.advancefeatures.concurency.example6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {
    private String name;

    public Task(String s) {
        name = s;
    }

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                Date d = new Date();
                SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                if (i == 0) {
                    System.out.println("Instialization Time for task name - " + name + " = " + ft.format(d));
                } else {
                    System.out.println("Executing Time for task name - " + name + " = " + ft.format(d));

                }
                Thread.sleep(100);
            }
            System.out.println(name + " completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
