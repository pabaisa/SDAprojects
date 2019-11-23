package lt.sdacademy.fundamentals.loop.for_each;

public class Example1 {
    public static void main(String[] args) {
        Animal dog = new Animal("Boss", "Kovinis");
        Animal cat = new Animal("Dolly", "Svelnuole");

        Animal[] animals = {dog, cat};
        for (Animal a : animals) {
            System.out.println(a.getName());
            System.out.println(a.getBreed());
        }
    }
}

class Animal {
    //Kintamieji
    private String name;
    private String breed;

    //Konstruktorius
    Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Kintamojo getteris - kad butu grazinamas "name"
    public String getName() {
        return name;
    }
    public  String getBreed () {return breed;}
}