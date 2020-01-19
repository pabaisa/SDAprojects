package lt.sdacademy.advancefeatures.generics.exercises1;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {

    private List<T> items;

    public GenericClass() {
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    public void storeValue(T value) {
        items.add(value);
    }
}
