package s1_08_lambdas_lvl2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MixList {
    public static List<String> stringsAndIntList = Arrays.asList("Yellow", "Magenta", "Cian", "213", "1412", "007", "Banana");
    //public static List<String> stringsWithE = filterStringsWIthE(stringsAndIntList);

//    public static void alphabeticalListSorter(List<String> list) {
//        stringsAndIntList.stream().sorted().forEachOrdered(System.out::println);
//    }
    public static void alphabeticalListSorter(List<String> list) {
        list.stream()
            .sorted(Comparator.comparingInt(listItem -> listItem.charAt(0)))
            .forEach(System.out::println);
}

//    public static List<String> filterStringsWIthE(List<String> list) {
//        System.out.println("Words that contain letter 'e' go first:");
//        return list.stream()
//                .filter(item -> item.contains("e"))
//                .sorted().toList((item1, item2) -> item1.contains("e")).compareTo(item2.contains("e"))
//                .collect(Collectors.toList());
//    }
}
