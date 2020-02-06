package lt.sdacademy.advancefeaturescoding.json;

import lt.sdacademy.advancefeatures.lambdaexpression.example2.Person;

import java.util.List;

public class Persons {
    private List<PersonalData>persons;

    public Persons(List<PersonalData>persons){
        this.persons = persons;
    }
    public void print(){
        for (PersonalData personalData:persons){
            System.out.println(personalData.toString());
        }
    }

    @Override
    public String toString() {
        return "Persons{" +
                "persons=" + persons +
                '}';
    }
}
