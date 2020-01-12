package lt.sdacademy.advancefeatures.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {
    public static void main (String[] args){
        List<String> travelRoute = new ArrayList<>();
        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Berlin");
        travelRoute.remove("Paris");

        for (String country : travelRoute){
            System.out.println(country + " ");
        }
    }
}
