package lt.sdacademy.fundamentalstesting.fridge;

public class NoSuchItemExeption extends Exception {
    public NoSuchItemExeption (String message){
        super(message); // paveldeto objekto kvietimas
    }
}
