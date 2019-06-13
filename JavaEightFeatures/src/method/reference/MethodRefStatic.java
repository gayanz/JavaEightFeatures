package method.reference;

import java.util.Arrays;
import java.util.List;

public class MethodRefStatic {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(10,11,12,100);

        //Lambda Example
        System.out.println(integers.stream().reduce((a,b) -> Math.max(a,b)));

        //Method Reference Example
        System.out.println(integers.stream().reduce(Math::max));
    }
}
