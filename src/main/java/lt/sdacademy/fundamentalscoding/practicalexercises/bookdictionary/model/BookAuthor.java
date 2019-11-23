package lt.sdacademy.fundamentalscoding.practicalexercises.bookdictionary.model;

public class BookAuthor {
    private String name;
    private String email;
    private String phoneNumber;

    public BookAuthor(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String toString(){
        //return String.format("Autoriaus vardas: %s, emailas: %s", name, email);
        return String.format ("%s, pastas: %s, telefono numeris: %s", name, email,phoneNumber);
    }
}
