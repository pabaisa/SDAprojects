package lt.sdacademy.advancefeatures.generics.exercises3;
        /*Sukurti klasę `TwoItems`, kuri viduje turi 2 kintamuosius (entry1 ir entry2) ir geterius jų reikšmėms gauti,
        bei toString() metodą.
         Išmėginti inicializuojant klasę su sveikais skaičiais ir tekstinio formato duomenimis.*/

public class TwoItems<T> {
    private T entry1;
    private T entry2;

    public TwoItems(T entry1, T entry2) {
        this.entry1 = entry1;
        this.entry2 = entry2;
    }

    public T getEntry1() {
        return entry1;
    }

    public T getEntry2() {
        return entry2;
    }

    @Override
    public String toString() {
        return "TwoItems{" +
                "entry1=" + entry1 +
                ", entry2=" + entry2 +
                '}';
    }
}
