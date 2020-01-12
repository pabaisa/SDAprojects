package lt.sdacademy.advancefeatures.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");
        for (Map.Entry<String, String> directionary : countries.entrySet()) {
            String country = directionary.getKey();
            String capital = directionary.getValue();
            System.out.printf("%s : %s\n", country, capital);
        }
    }
}
