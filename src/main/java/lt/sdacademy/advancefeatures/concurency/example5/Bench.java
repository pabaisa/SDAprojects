package lt.sdacademy.advancefeatures.concurency.example5;

public class Bench {

    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void takeASeat() {
        if (availableSeats > 0) {
            System.out.println("Take a seat.");
            availableSeats--;
            System.out.println("Free seat left: " + availableSeats);

        } else {
            System.out.println("There are no availeble seats. :(");
        }
    }

    public synchronized void methodWithSyncedCodeBlock() {
        System.out.println("Unsynced part");
      //  synchronized (this) {
            if (availableSeats > 0) {
                System.out.println("Take a seat.");
                availableSeats--;
                System.out.println("Free seat left: " + availableSeats);

            } else {
                System.out.println("There are no availeble seats. :(");
            }
       // }
    }
}