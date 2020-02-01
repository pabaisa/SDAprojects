package lt.sdacademy.advancefeaturescoding.deliverie;

public class Person extends Location{
    private String deliverieUntil;
    private GadgetType gadgetType;

    public Person(String name, String address, GadgetType gadgetType, String deliverieUntil) {
        super(name, address);
        this.gadgetType = gadgetType;
        this.deliverieUntil = deliverieUntil;
    }


}
