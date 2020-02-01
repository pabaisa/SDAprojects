package lt.sdacademy.advancefeatures.concurency.example8workinclass;

public class Main {
    public static void main(String[] args) {
        Class class1 = new Class(10);
        new Thread(class1).start();

        Class class2 = new Class(5);
        new Thread(class2).start();
        class1.stopMe();

        Class class3 = new Class(3);
        new Thread(class3).start();
        class1.stopMe();
        class2.stopMe();
    }
}
