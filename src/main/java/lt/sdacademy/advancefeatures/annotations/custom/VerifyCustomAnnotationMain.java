package lt.sdacademy.advancefeatures.annotations.custom;

import java.lang.reflect.Method;

public class VerifyCustomAnnotationMain {
    public static void main(String[] args) {
        try {
            CustomAnnotationTestClass obj = new CustomAnnotationTestClass();
            Method method = obj.getClass().getMethod("sayHello");

            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            System.out.printf("Name: %s and age: %d", myAnnotation.name(), myAnnotation.age());
            //System.out.printf(myAnnotation.value());
        } catch (Exception e) {
            System.out.println("Something test wrong!");
        }
    }
}
