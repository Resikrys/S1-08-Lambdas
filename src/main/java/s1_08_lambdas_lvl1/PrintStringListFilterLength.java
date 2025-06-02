package s1_08_lambdas_lvl1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintStringListFilterLength {
    public static List<String> doggyNames = Arrays.asList("Yue", "Happy", "Chusky", "Leona", "Fosca", "Sol");
    public static List<String> namesWithOAndLength5 = filterStringsByCharAndLength(doggyNames);

    public static List<String> filterStringsByCharAndLength(List<String> list) {
        System.out.println("Words with at least 5 characters and that contain letter 'o':");
        return list.stream()
                .filter(dogName -> dogName.contains("o") && dogName.length() == 5)
                .collect(Collectors.toList());
    }
}
