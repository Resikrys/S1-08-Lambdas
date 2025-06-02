package s1_08_lambdas_lvl1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStrings {
    public static List<String> randomNames = Arrays.asList("Allegretto", "Lenlil", "Askariz", "Yang", "Haroin",
            "Elyrion", "Willdibrer", "Grakaton", "Echö");

    public static void sortNamesFromShortestToLargest(List<String> randomNames) {
        randomNames.sort((string1, string2) -> Integer.compare(string1.length(), string2.length()));
        System.out.println("Names sorted from shortest to largest:");
        randomNames.forEach(System.out::println);
    }

    public static void sortNamesFromLongestToShortest(List<String> randomNames) {
        randomNames.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println("Names sorted from longest to shortest:");
        randomNames.forEach(System.out::println);
    }

}
