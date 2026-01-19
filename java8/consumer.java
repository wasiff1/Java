
It accepts one input argument and returns nothing (void).

Consumer – Definition
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}

Takes one parameter

No return value

Mostly used for performing operations, not producing results
========================================================================
package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClass {
    public static void main(String[] args) {
        Consumer<String > consumer = c-> System.out.println(c);
        consumer.accept("Wasif");

        Consumer<List<Integer>> listConsumer1 = c->{
            for(Integer i :c){
                System.out.println(i+10);

            }
        };
        Consumer<List<Integer>> listConsumer2 = c->{
            for(Integer i :c){
                System.out.println(i+10);

            }
        };


        Consumer<List<Integer>> listConsumer = listConsumer2.andThen(listConsumer1);
       listConsumer.accept(Arrays.asList(1,2,3,4,5));
    }
}
// BIConsumer
It accepts two input arguments and returns nothing.

Definition
@FunctionalInterface
public interface BiConsumer<T, U> {
    void accept(T t, U u);
}

Takes 2 parameters
No return value
Used when you want to perform an action using two values.
  
package consumer;
import java.util.function.BiConsumer;

public class BiConsumers {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (x,y)->{
            System.out.println(x+y);
        };
        biConsumer.accept(2,3);
    }
}















