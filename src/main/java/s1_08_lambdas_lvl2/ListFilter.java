package s1_08_lambdas_lvl2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {
    public static List<String> doggyNames = Arrays.asList("Yue", "Happy", "Aki", "Chusky", "Leona", "Archibald");
    public static List<String> namesWithAAndLength3 = filterStringsFirstCharAndLength(doggyNames);

    public static List<String> filterStringsFirstCharAndLength(List<String> list) {
        System.out.println("Names with 3 characters and start with 'A':");
        return list.stream()
                .filter(dogName -> dogName.startsWith("A") && dogName.length() == 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
