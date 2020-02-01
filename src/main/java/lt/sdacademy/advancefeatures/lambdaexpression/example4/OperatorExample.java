package lt.sdacademy.advancefeatures.lambdaexpression.example4;

import java.util.function.UnaryOperator;

public class OperatorExample {
    public static void main (String[] args){
        UnaryOperator<Integer> toSquareOperator = i -> i*i;
        System.out.println(toSquareOperator.apply(5));
    }
}
