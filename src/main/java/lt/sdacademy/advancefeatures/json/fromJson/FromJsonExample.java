package lt.sdacademy.advancefeatures.json.fromJson;

import com.google.gson.Gson;
import lt.sdacademy.advancefeatures.json.utils.Staff;
import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FromJsonExample {
    private static final Logger logger = Logger.getLogger(FromJsonExample.class);
    private static final String INPUT_FILE_LOCATION = "C:\\Users\\Modestas\\IdeaProjects\\bandymas\\src\\main\\java\\lt\\sdacademy\\advancefeatures\\json\\utils\\file1.json";

    public static void main(String[] args) {
        Gson gson = new Gson();

        try (Reader reader = new FileReader(INPUT_FILE_LOCATION)) {
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println(staff);

            logger.info("Data was read successfully");

        } catch (IOException e) {
            logger.error("Error occurred while reader file!");
        }
    }
}
