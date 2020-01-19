package lt.sdacademy.advancefeatures.exeptions.customexeption;

public class CustomExceptionMain {
    private static final String TEXT = "tekstas";

    public static void main(String[] args) {
        try {
            if (!TEXT.equals("tekstas1")) {
                throw new CustomException("Bad text found");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
