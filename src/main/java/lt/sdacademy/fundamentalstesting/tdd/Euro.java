package lt.sdacademy.fundamentalstesting.tdd;

public class Euro {
    private double amount;

    public Euro(int amount) {
        this.amount = (double) amount;
    }

    @Override
    public String toString() {
        return String.format("EUR %.2f", amount);
    }

    public boolean equal(Object o) {
        return o instanceof Euro && amount == ((Euro) o).amount;
    }

    public int subtract(int number) {
        return (int) amount - number;
    }

    /*public double divide(int qty) {
        return (double) Euro / new amount;

    }*/
}
