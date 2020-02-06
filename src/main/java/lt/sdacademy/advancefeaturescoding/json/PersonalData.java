package lt.sdacademy.advancefeaturescoding.json;

public class PersonalData {
    String name;
    String surname;
    String phone;

    public PersonalData(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "name= " + name + "\'" +
                ", surname=" + surname + "\'" +
                ", phone=" + phone + "\'" + "}";
    }
}
