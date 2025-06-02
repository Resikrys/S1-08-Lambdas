package s1_08_lambdas_lvl1;

import static s1_08_lambdas_lvl1.PrintMonths.MONTHS;
import static s1_08_lambdas_lvl1.PrintStringList.namesWithO;
import static s1_08_lambdas_lvl1.PrintStringListFilterLength.namesWithOAndLength5;

public class Task8 {
    public static void main(String[] args) {

        namesWithO.forEach(System.out::println);
        namesWithOAndLength5.forEach(System.out::println);

        PrintMonths.printMonths(MONTHS);
        PrintMonths.printMonthsReference(MONTHS);
    }
}
