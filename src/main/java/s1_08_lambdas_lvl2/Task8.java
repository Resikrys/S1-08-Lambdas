package s1_08_lambdas_lvl2;

import static s1_08_lambdas_lvl2.IntegerFilter.sortedNums;
import static s1_08_lambdas_lvl2.ListFilter.namesWithAAndLength3;

public class Task8 {
    public static void main(String[] args) {
        namesWithAAndLength3.forEach(System.out::println);

        System.out.println(String.join(", ", sortedNums));
    }
}
