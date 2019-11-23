package lt.sdacademy;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[2];
        array[0] = 2551;
        array[1] = 45856;

        for (int i = 0; i < 5; i = i + 1) {
            if (i < 2) {
                System.out.println("Int maziau uz 2");
            } else if (i == 3) {
                System.out.println("Indexas lygus 3-ims");
            } else {
                System.out.println("Indexas daugiau uz 3");
            }

            //         try {
            //             System.out.println("Result:" + array[i]);
            //         } catch (Exception vardas) {

            //             System.out.println("klaida" + vardas);
        }
    }
}


