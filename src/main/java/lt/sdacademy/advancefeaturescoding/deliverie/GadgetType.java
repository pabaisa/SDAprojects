package lt.sdacademy.advancefeaturescoding.deliverie;

import java.util.HashMap;
import java.util.Map;

public enum GadgetType {
    PHONE("telefonas"),
    LAPTOP("nesiojamas kompiuteris"),
    TV("televizorius"),
    PERSONAL_COMPUTER("kompiuteris"),
    MICRO_CONTROLLER("mikro kontroleris");


    private static final Map<String, GadgetType> gadgetNames = new HashMap<>();


    static{
        for(GadgetType gadgetType: GadgetType.values()){
            gadgetNames.put(gadgetType.name, gadgetType);
        }
    }

    final String name;

    GadgetType(String gadgetName) {
        this.name = gadgetName;
    }

    public static GadgetType gadgetTypeLookup(String gadetName){
        return gadgetNames.get(gadetName);
    }
}
