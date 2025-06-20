package s1_08_lambdas_lvl1;

import java.util.Arrays;
import java.util.List;

public class PrintMonths {
    public static final List<String> MONTHS = Arrays.asList("January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December");

    public static void printMonths(List<String> list) {
        System.out.println("Months in a year:");
        //MONTHS.forEach(month -> System.out.println(month));
        MONTHS.forEach(System.out::println);
    }

    public static void printMonthsReference(List<String> list) {
        System.out.println("Months in a year using Reference:");
        MONTHS.forEach(System.out::println);
    }
}

