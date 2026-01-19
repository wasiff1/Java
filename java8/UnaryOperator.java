UnaryOperator is a special type of Function from java.util.function.
👉 Takes 1 input and returns the SAME type.
@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
}

Key Points
Input type = Output type
No extra methods (inherits apply() from Function)
Used when type doesn’t change
Cleaner than Function<T, T>
====================================================================  



package function;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorClass {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (x)->x*x;
        System.out.println(unaryOperator.apply(5));

        UnaryOperator<String> stringUnaryOperator = (str)->str.toLowerCase();
        System.out.println(stringUnaryOperator.apply("Wasif"));

        BiFunction<String,String ,String> stringBiFunction= (str1,str2)->str1+str2;
        // takes two input type string and return one  string output
        System.out.println(stringBiFunction.apply("wasif","ahmad"));

        BinaryOperator<String> binaryOperator = (st1,st2)->st1+st2;
        System.out.println(binaryOperator.apply("wasif","md"));
    }
}
