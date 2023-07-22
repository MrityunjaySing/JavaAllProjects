package StreamAPI;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LaunchStr {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,5,8,9);
      Stream<Integer>streamData = list.stream();
     // streamData.forEach(n-> System.out.println(n));
    Stream<Integer>finalStram = streamData.filter(n->n%2==0)//mathod channing
            .sorted()
            .map(n->n*2);

     // Stream<Integer> sortedStream = filterData.sorted();
     // Stream<Integer> mapStream = sortedStream.map(n->n*2);
      finalStram.forEach(n-> System.out.println(n));
    }
}
