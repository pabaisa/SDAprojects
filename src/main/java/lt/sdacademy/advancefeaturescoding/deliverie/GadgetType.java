package lt.sdacademy.advancefeaturescoding.deliverie;

import java.util.HashMap;
import java.util.Map;

public enum GadgetType {
    PHONE("telefonas"),
    LAPTOP("nesiojamas kompiuteris"),
    TV("televizorius"),
    PERSONAL_COMPUTER("kompiuteris"),
    MICRO_CONTROLLER("mikro kontroleris");

    private static final Map<String, GadgetType> GadgetName = new HashMap<>();

    GadgetType (String gadgetName) {
           }

}
