package lt.sdacademy.advancefeatures.concurency.example8workinclass;

public class Class implements Runnable {

    private int number;
    private boolean finished;

    public Class(int number) {
        this.number = number;
    }

    public void increaseNumber() {
        number++;
    }

    public void stopMe() {
        this.finished = true;
    }

    @Override
    public void run() {
        while (number <= 10 || !finished) {
            try {
                System.out.println("Hello! " + number);
                increaseNumber();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
