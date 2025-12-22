import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//class Task implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("Running");
//    }
//}
public class PreStreams {
    public static void main(String[] args) {
        //lambda expression
//        Task process1 = new Task();
//        process1.run();
        Runnable process1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        };
        process1.run();
        Runnable process2 = () -> {
            System.out.println("Running");
        };
        process2.run();

        //Predicate --> functional interface is an boolean valued function which returns a boolean in return of single value given in argument by comparing with the operating condition provided in implementation
        Predicate <Integer> isEven  = x -> x%2==0;
        System.out.println(isEven.test(6));
        Predicate <String> startswithA = x -> x.toLowerCase().startsWith("a");
        Predicate <String> endswithT= x -> x.toLowerCase().endsWith("t");
        System.out.println(startswithA.and(endswithT).test("anki"));
        System.out.println(startswithA.or(endswithT).test("Anki"));

        //Function --> functional interface which will perform some work defined in implementation
        Function <Integer , Integer> doubleIt = x -> 2*x;
        Function <Integer , Integer> tripleIt = x -> 3*x;
        System.out.println(doubleIt.andThen(tripleIt).apply(4));
        System.out.println(doubleIt.compose(tripleIt).apply(4));
        Function<Integer , Integer> identity = Function.identity();
        System.out.println(identity.apply(5));

        //Consumer --> functional interface which consume value and perform some function but returns nothing
        Consumer<Integer> print = System.out::println;
        print.accept(400);
        List <Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);
        Consumer <List<Integer>> printList = x -> {
            for (int i : x)
            {
                System.out.println(i);
            }
        };
        printList.accept(num);

        //Supplier --> functional interface which supplies values in return and take no argument
        Supplier <Integer> evenNum = () ->
    }
}
