package s1_08_lambdas_lvl1;

import static s1_08_lambdas_lvl1.PrintMonths.MONTHS;
import static s1_08_lambdas_lvl1.PrintStringList.namesWithO;
import static s1_08_lambdas_lvl1.PrintStringListFilterLength.namesWithOAndLength5;
import static s1_08_lambdas_lvl1.SortStrings.randomNames;

public class Task8 {
    public static void main(String[] args) {
        PiInterface piValue = () -> 3.1415;
        ReverseInterface reversor = newString -> new StringBuilder(newString).reverse().toString();
        String stringTobeReversed = "Banana";
        String stringReversed = reversor.reverse(stringTobeReversed);

        namesWithO.forEach(System.out::println);
        namesWithOAndLength5.forEach(System.out::println);

        PrintMonths.printMonths(MONTHS);
        PrintMonths.printMonthsReference(MONTHS);

        System.out.println("Pi value is: " + piValue.getPiValue());

        SortStrings.sortNamesFromShortestToLargest(randomNames);
        SortStrings.sortNamesFromLongestToShortest(randomNames);

        System.out.println("Original string: " + stringTobeReversed);
        System.out.println("Reversed string: " + stringReversed);
    }
}
