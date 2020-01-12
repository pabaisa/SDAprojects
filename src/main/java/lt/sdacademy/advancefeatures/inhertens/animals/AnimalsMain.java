package lt.sdacademy.advancefeatures.inhertens.animals;

/*
Create classes Dog and Cat.
a) Move common methods and fields to the class Animal.
b) Create method „yieldVoice".
c) Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
d) Using for-each loop show which animal gives what kind of voice. How to print a name of an object?
*/


import java.util.Arrays;
import java.util.List;

public class AnimalsMain {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Cat(true, "miau", "withe"),
                new Dog(true, "au", "pitbul"),
                new Cat(true, "mrrrr", "brown")
        );
        for (Animal animal : animals) {
            System.out.println(animal.yieldVoice());
            System.out.println(animal.getClass().getSimpleName());
        }

    }
}
