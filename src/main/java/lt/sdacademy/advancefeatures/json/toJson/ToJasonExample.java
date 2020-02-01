package lt.sdacademy.advancefeatures.json.toJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lt.sdacademy.advancefeatures.json.utils.Staff;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class ToJasonExample {

    private static final Logger logger = Logger.getLogger(ToJasonExample.class);
    private static final String INPUT_FILE_LOCATION = "C:\\Users\\Modestas\\IdeaProjects\\bandymas\\src\\main\\java\\lt\\sdacademy\\advancefeatures\\json\\utils\\file1.json";

    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Staff staff = Staff.buildStaff();

        String staffInJason = gson.toJson(staff);
        logger.info(staffInJason);

        try (FileWriter writer = new FileWriter(INPUT_FILE_LOCATION)) {
            gson.toJson(staffInJason, writer);
            logger.info("Information was successfully wrote into file.");
        } catch (IOException e) {
            logger.error("File not found!");
        }
    }
}
