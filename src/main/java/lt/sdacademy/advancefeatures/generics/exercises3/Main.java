package lt.sdacademy.advancefeatures.generics.exercises3;

/*Sukurti klasę `TwoItems`, kuri viduje turi 2 kintamuosius (entry1 ir entry2) ir geterius jų reikšmėms gauti,
  bei toString() metodą.
  Išmėginti inicializuojant klasę su sveikais skaičiais ir tekstinio formato duomenimis.*/

public class Main {
    public static void main (String[]args){
        TwoItems <String> twoItems = new TwoItems("Jonas", "Petras");
        TwoItems <Integer> twoItems2 = new TwoItems(5,6);

        System.out.println(twoItems);
        System.out.println(twoItems2);
    }
}
