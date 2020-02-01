package lt.sdacademy.advancefeaturescoding.deliverie;

public class Gadget {

    private GadgetType gadgetType;
    private int price;
    private Courier courier;

    public Gadget(GadgetType gadgetType, int price, Courier courier) {
        this.gadgetType = gadgetType;
        this.price = price;
        this.courier = courier;
    }
}
