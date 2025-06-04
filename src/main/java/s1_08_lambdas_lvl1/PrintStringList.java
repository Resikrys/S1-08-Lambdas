package s1_08_lambdas_lvl1;

import java.util.List;
import java.util.stream.Collectors;

public class PrintStringList {
    public static List<String> names = List.of("Yue", "Happy", "Chusky", "Leona", "Fosca", "Mooney");
    public static List<String> namesWithO = filterStringsWIthO(names);


    public static List<String> filterStringsWIthO(List<String> list) {
        System.out.println("Words that contain letter 'o':");
        return list.stream()
                .filter(name -> name.contains("o"))
                .collect(Collectors.toList());
    }

}
