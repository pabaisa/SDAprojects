package lt.sdacademy.algoritmsanddatastructure.algorithms;

public class BinarySearch {
    private static final int VALUE_TO_FIND = 87852;

    public static void main(String[] args) {
        int[] masiv = {12, 15, 20, 211, 584, 789, 1001, 87852};
        int left = 0;
        int right = masiv.length - 1;
        int mid;

        boolean found = false;

        while (left <= right) {
            mid = (left + right) / 2;
            if (VALUE_TO_FIND == masiv[mid]) {
                System.out.printf("Found value %d at position %d.", VALUE_TO_FIND, mid + 1);
                found = true;
                break;
            } else {
                if (VALUE_TO_FIND < masiv[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        if (!found){System.out.printf("The value %d not found", VALUE_TO_FIND);}
    }
}
