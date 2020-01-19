package lt.sdacademy.advancefeatures.generics.exercises1;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        GenericClass value = new GenericClass();
        value.storeValue("lass");
        value.storeValue(100);
        value.storeValue(5.2);

        List items = value.getItems();

        for (Object item : items)
            System.out.println(item);


    }
}
