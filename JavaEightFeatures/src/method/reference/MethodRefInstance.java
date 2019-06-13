package method.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefInstance {

    public static void main(String[] args) {


        /**
         * Reference to an Instance Method of a Particular Object (methodRefInstance object)
         */

        List<Integer> numbers = Arrays.asList(1,6,5,3,4,2);
        MethodRefInstance methodRefInstance = new MethodRefInstance();

        //Lambda Example
        Collections.sort(numbers, (a,b) -> methodRefInstance.compareNumbers(a,b));

        //Method Reference Example
        //Collections.sort(numbers, methodRefInstance::compareNumbers);

       // System.out.println(numbers);



        /**
         * Reference to an Instance Method of an Arbitrary Object (fruit object inside a loop) of a Particular Type
         */

        Fruit mango = new Fruit("mango", true);
        Fruit pineapple = new Fruit("pineapple", true);
        Fruit orange = new Fruit("orange", false);
        Fruit banana = new Fruit("banana", false);

        List<Fruit> basket = new ArrayList<>();
        basket.add(mango);
        basket.add(pineapple);
        basket.add(orange);
        basket.add(banana);

        //Lambda Example
        //List<Fruit> RipedFruits = basket.stream().filter(fruit -> fruit.isRiped()).collect(Collectors.toList());

        //Method Reference Example
        List<Fruit> RipedFruits = basket.stream().filter(Fruit::isRiped).collect(Collectors.toList());

        System.out.println(RipedFruits);

    }

    public int compareNumbers(Integer a, Integer b) {
        return a.compareTo(b);
    }


}
