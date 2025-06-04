package s1_08_lambdas_lvl2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MixList {
    public static List<String> stringsAndIntList = Arrays.asList("Yellow", "Magenta", "Cian", "213", "1412", "007", "Banana");
    public static List<String> sortedByEList = filterStringsWithE(stringsAndIntList);
    public static List<String> replacedLettersList = replaceAWith4(stringsAndIntList);

    //    public static void alphabeticalListSorter(List<String> list) {
//        stringsAndIntList.stream().sorted().forEachOrdered(System.out::println);
//    }
    public static void alphabeticalListSorter(List<String> list) {
        System.out.println("List sorted in alphabetical order:");
        list.stream()
                .sorted(Comparator.comparingInt(listItem -> listItem.charAt(0)))
                .forEach(System.out::println);
    }

    public static List<String> filterStringsWithE(List<String> list) {
        return list.stream()
//                .sorted((listItem1, listItem2) -> {
//                    boolean listItem1HasE = listItem1.contains("e");
//                    boolean listItem2HasE = listItem2.contains("e");
//                    return Boolean.compare(!listItem1HasE, !listItem2HasE);
//                })
                .sorted(Comparator.comparing(listItem -> !listItem.contains("e")))
                .toList();

    }

    public static List<String> replaceAWith4(List<String> list) {
        return list.stream()
                .map(itemList -> itemList.replace("a", "4"))
                .toList();
    }

    public static void filterNumericStrings(List<String> list) {
        System.out.println("Numbers in the list:");
        list.stream()
                .filter(listItem -> listItem.matches("\\d+"))
                .forEach(System.out::println);
    }


}
