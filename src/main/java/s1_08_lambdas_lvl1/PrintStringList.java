package s1_08_lambdas_lvl1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintStringList {
    public static List<String> names = Arrays.asList("Yue", "Happy", "Chusky", "Leona", "Fosca");
    public static List<String> namesWithO = filterStringsWIthO(names);



    public static List<String> filterStringsWIthO(List<String> list) {
        System.out.println("Words that contain letter 'o':");
        return list.stream()
                .filter(p -> p.contains("o"))
                .collect(Collectors.toList());
    }

}
