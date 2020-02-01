package lt.sdacademy.advancefeaturescoding.deliverie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
    //private static final String INPUT_FILE = "C:\\Users\\Modestas\\IdeaProjects\\bandymas\\src\\main\\java\\lt\\sdacademy\\advancefeaturescoding\\deliverie\\Data.txt";

    public static void main(String[] args) throws FileNotFoundException { /*
        BufferedReader br = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(INPUT_FILE));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
File file = new  File ("Data.txt");
        Scanner scanner = new Scanner(file);

        System.out.println(scanner.nextLine());
    }
}


