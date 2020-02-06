package lt.sdacademy.advancefeaturescoding.deliverie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Deliveries:
        * Susikurti 5 objektus: `Company`, `Gadget`, `GadgetType`, `Distributor`, `Person`
        * Privaloma naudoti abstrakčias klases;
        * Person turi talpinti laukus (`name`, `deliveryAddress`, `gadgetType`, `deliverUntil`);
        * Company turi talpinti laukus (`name`, `companyAddress`, `gadget`);
        * Gadget turi talpinti (`gadgetType`, `price`, `distributor`);
        * Distributor turi talpinti (`name`, `deliveredFrom`', `deliveryDate`)
        * GadgetType turi talpinti tipus -> (PHONE, LAPTOP, TV, PERSONAL_COMPUTER, MICRO_CONTROLLER);
        * Duomenys turi būti skaitomi iš failo.    * Inicializuoti 3 `Person` objektus. Vienas `Person` objektas privalo turėti 1-3 `Gadget` objektus;
        * Privaloma naudoti abstrakčia klasę;
        * Atvaizduoti `Company` objektą kuris turi brangiausią `Gadget` objektą;
        * Atvaizduoti kurie žmonės gaus VISAS siuntas laiku;
        * Visa informacija išvedama į result.txt failą.
*/
public class DeliveriesMain {
    private static final String INPUT_FILE = "C:\\Users\\Modestas\\IdeaProjects\\bandymas\\src\\main\\java\\lt\\sdacademy\\advancefeaturescoding\\deliverie\\Data.txt";

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE))) {

            String strCurrentLine;

            List<Person> personList = new ArrayList<>();
            int counter = 0;
            int numberOfPersons = 0;
            int numberOfCompanies = 0;
            while ((strCurrentLine = br.readLine()) != null) {
                counter++;
                if (counter == 1) {
                    numberOfPersons = Integer.parseInt(strCurrentLine);
                } else if (counter == 2) {
                    numberOfCompanies = Integer.parseInt(strCurrentLine);
                } else {
                    if (counter <= numberOfCompanies) {
                        personList.add(createPersonObj(strCurrentLine));
                    } else {
                        createCompanyObj(strCurrentLine);
                    }
                }

                System.out.println(strCurrentLine);
            }
            System.out.println(personList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createCompanyObj(String strCurrentLine) {
    }

    private static Person createPersonObj(String strCurrentLine) {
        String[] personDetails = strCurrentLine.split(",");
        List<GadgetType> gadgetTypeList = Arrays.asList(personDetails[2].split("-"))
                .stream()
                .map(gadget -> GadgetType.gadgetTypeLookup(gadget))
                .collect(Collectors.toList());

       // List<String> gadgetList = Arrays.asList(personDetails[2].split("-"));
       // List<GadgetType> gadgetTypeList1 = new ArrayList<>();
       // for(String gadget: gadgetList){
      //      GadgetType gadgetType = GadgetType.gadgetTypeLookup(gadget);
      //      gadgetTypeList1.add(gadgetType);
      //  }

        Person person = new Person(personDetails[0], personDetails[1], gadgetTypeList, personDetails[3]);

        //System.out.println(person);
        return person;
    }
}





