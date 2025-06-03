package s1_08_lambdas_lvl2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerFilter {
    //Array
    public static Integer nums[] = new Integer[] { 2, 13, 36, 42, 97, 213, 1412 };
    public static List<Integer> intList = Arrays.asList(nums);
    public static List<String> sortedNums = oddEvenIntegerFilter(intList);

    public static List<String> oddEvenIntegerFilter(List<Integer> list) {
        return list.stream()
                .map(num -> (num % 2 == 0 ? "e" : "o") + num)
                .collect(Collectors.toList());
    }

}
