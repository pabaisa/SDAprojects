package lt.sdacademy.advancefeaturescoding.deliverie;

import java.util.List;

public class Person extends Location{
    private String deliverieUntil;
    private List<GadgetType> gadgetType;

    public Person(String name, String address, List<GadgetType> gadgetType, String deliverieUntil) {
        super(name, address);
        this.gadgetType = gadgetType;
        this.deliverieUntil = deliverieUntil;
    }


    @Override
    public String toString() {
        return "Person{" +
                "deliverieUntil='" + deliverieUntil + '\'' +
                ", gadgetType=" + gadgetType +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
