package lt.sdacademy.advancefeaturescoding.deliverie;

public class Company extends Location{

    private Gadget gadget;

    public Company(String name, String address, Gadget gadget) {
        super(name, address);
        this.gadget = gadget;
    }
}
