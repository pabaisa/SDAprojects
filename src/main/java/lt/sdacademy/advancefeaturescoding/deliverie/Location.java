package lt.sdacademy.advancefeaturescoding.deliverie;

public abstract class Location {
    protected String name;
    protected String address;

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
