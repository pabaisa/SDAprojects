package lt.sdacademy.advancefeatures.annotations.custom;

public class CustomAnnotationTestClass {
    @MyAnnotation(/*value = "sestadienis",*/ name="Modestas", age = 30)
    public void sayHello(){
        System.out.println("Hello world!");
    }
}
