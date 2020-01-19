package lt.sdacademy.advancefeatures.exeptions;

public class NullPointerExeptionExample {
    public static void main(String[] args) throws IvykoArtimetineKlaida {
        try {
            String a = null; // null value
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("NullPointerExeption...");
            throw new IvykoArtimetineKlaida ("pranesimas siorinei klasei");// pranesimas isorinai klasei
        }
    }
}
