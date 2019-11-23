package lt.sdacademy.fundamentalscoding.practicalexercises.worker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkerMain {
    private static final String FILE_LOCATION = "C:\\Users\\Modestas\\IdeaProjects\\bandymas\\src\\main\\java\\lt\\sdacademy\\fundamentalscoding\\practicalexercises\\worker\\WorkerData.txt";

    public static void main(String[] args) {
        List<Worker> workerList = getWorkersList();
        System.out.println(getWorkersList().size());
        System.out.println("Vidutinis amzius - " + averageAge(workerList));
        System.out.println("Vidutinis atlyginimas - " + averageSalary(workerList));
        System.out.println("Didziausias atlyginimas - " + bigestSalary(workerList));
        System.out.println("Jauniausia darbuotoja - " + findYoungest(workerList).getName());

    }

    private static List<Worker> getWorkersList() {
        List<Worker> workerList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = "";
            while (line != null) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                workerList.add(mapDataObject(line.split(",")));
            }
        } catch (IOException e) {
            System.out.println("Ivyko klaida!");
        }
        return workerList;
    }

    private static Worker mapDataObject(String[] workerData) {
        return new Worker(workerData[0], Integer.parseInt(workerData[1]), Integer.parseInt(workerData[2]), workerData[3]);
    }

    private static int averageAge(List<Worker> workersList) {
        int averageAge = 0;

        for (Worker workerAge : workersList) {
            averageAge += workerAge.getAge();
        }
        return averageAge / workersList.size();
    }

    private static int averageSalary(List<Worker> workersList) {
        int averageSalary = 0;

        for (Worker workerSalary : workersList) {
            averageSalary += workerSalary.getSalary();
        }
        return averageSalary / workersList.size();
    }

    private static String bigestSalary(List<Worker> workersList) {
        String bigestSalaryName = workersList.get(0).getName();

        int bigestSalary = workersList.get(0).getSalary();

        for (Worker workerSalary : workersList) {
            if (bigestSalary < workerSalary.getSalary()) {
                bigestSalary = workerSalary.getSalary();
                bigestSalaryName = workerSalary.getName();
            }

        }
        return bigestSalaryName;
    }

    private static Worker findYoungest(List<Worker> workerList) {
        Worker worker = workerList.get(0);
        int youngestAge = workerList.get(0).getAge();

        for (Worker w : workerList) {
//            youngestAge = Math.min(youngestAge, workerAge.getAge());

            if (youngestAge > w.getAge()) {
                youngestAge = w.getAge();
                worker = w;
            }
        }
        return worker;
    }
}
