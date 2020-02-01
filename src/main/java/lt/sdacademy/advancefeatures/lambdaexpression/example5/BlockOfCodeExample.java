package lt.sdacademy.advancefeatures.lambdaexpression.example5;

import java.util.function.UnaryOperator;

public class BlockOfCodeExample {

    public static void main (String[] args){
        UnaryOperator<Integer> toSquareUnaryOperation = i -> {
            int result = i*i;
            System.out.println("Result: " + result);
            return result;
        };
        toSquareUnaryOperation.apply(4);
    }
}
