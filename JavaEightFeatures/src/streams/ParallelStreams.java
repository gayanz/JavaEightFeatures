package streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreams {

    public static void main(String[] args) {

        List<Integer> intNumbers = Arrays.asList(2, 5, 10, 32, 58);
        //creating a stream from the intNumbers
        //intNumbers.stream();

        //parallel streaming
        intNumbers.parallelStream().forEach(item ->addTenToNumbers(item));
    }

    public static void addTenToNumbers(int a) {
        System.out.println("Adding 10 to " + a +", The answer is =" + (a+10));
    }
}
