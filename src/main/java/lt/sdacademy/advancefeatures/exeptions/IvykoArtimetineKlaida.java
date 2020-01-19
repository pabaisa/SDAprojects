package lt.sdacademy.advancefeatures.exeptions;

public class IvykoArtimetineKlaida extends Exception {
    private  String message;

    public IvykoArtimetineKlaida(String message){
        this.message=message;
    }
}
