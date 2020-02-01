package lt.sdacademy.advancefeaturescoding.deliverie;

public class Courier extends Location{
    private String deliveryDate;
    public Courier(String name, String address, String deliveryDate) {
        super(name, address);
        this.deliveryDate=deliveryDate;
    }
}
