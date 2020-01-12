package lt.sdacademy.advancefeatures.inhertens.abstractexample;

public abstract class Animal {
    protected boolean mammal;
    protected String voice;

    public Animal(boolean mammal, String voice){
        this.mammal = mammal;
        this.voice = voice;
    }
    public String yieldVoice(){
        return String.format("My voice: %s" , voice);
    }
}
