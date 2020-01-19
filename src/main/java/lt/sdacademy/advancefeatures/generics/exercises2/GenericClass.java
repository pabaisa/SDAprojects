package lt.sdacademy.advancefeatures.generics.exercises2;

import java.util.List;

public class GenericClass<T> {

    public static <T> T lastEntry(List<T> items) {
        return items.get(items.size() - 1);
    }
}
