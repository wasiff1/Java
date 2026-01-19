Supplier
  ==========
Supplier is a functional interface from java.util.function.
👉 Takes no input and returns a value.

@FunctionalInterface
public interface Supplier<T> {
    T get();
}
Key Points
No arguments
Returns value
Method → get()
Used for object/value creation
Often used in lazy initialization
  ======================================================


package supplier;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierClass {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()->100;
        System.out.println(supplier.get());

        Predicate<Integer> predicate = (x)->x>2;
        Function<Integer,Integer> function = (x)->x*x;
        Consumer<Integer> consumer = x-> System.out.println(x);
        Supplier<Integer> supplier1 = ()->100;
        if(predicate.test(supplier1.get())){
            consumer.accept(function.apply(supplier1.get()));
        }

    }
}
