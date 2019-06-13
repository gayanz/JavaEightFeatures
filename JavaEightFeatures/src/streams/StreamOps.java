package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOps {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("bb", "c", "a", "d", "ef", "f");

        StreamOps streamOps = new StreamOps();

        // Calling the iterator.
        streamOps.iterateTheStream(stringList);

        // Calling the filter.
        streamOps.filterTheStream(stringList);

    }


    public void iterateTheStream(List<String> stringList) {

        // Substituting the loops.
        boolean isExist = stringList.stream().anyMatch(element -> element.contains("a"));

        if (isExist) {
            System.out.println("Match found!");
        } else {
            System.out.println("No Matches found!");
        }

        // Traditional way of iterating using for-loop.
        /*for (String s: stringList) {
            if (s.contains("a")) {
                System.out.println("Match found!");
            }
        }*/
    }


    public void filterTheStream(List<String> stringList) {

        List<String> filteredList = stringList.stream().filter(element -> element.contains("f")).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
