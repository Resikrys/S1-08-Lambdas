package s1_08_lambdas_lvl2;

import static s1_08_lambdas_lvl2.IntegerFilter.sortedNums;
import static s1_08_lambdas_lvl2.ListFilter.namesWithAAndLength3;
import static s1_08_lambdas_lvl2.MixList.*;

public class Task8 {
    public static void main(String[] args) {
        float x = 2.13F;
        float y = 7.7F;
        Operation addition = () -> x+y;
        Operation substraction = () -> x-y;
        Operation multiplication = () -> x*y;
        Operation division = () -> x/y;

        namesWithAAndLength3.forEach(System.out::println);

        System.out.println(String.join(", ", sortedNums));


        System.out.println(x + " + " + y + " = " + addition.getResult());
        System.out.println(x + " - " + y + " = " + substraction.getResult());
        System.out.println(x + " * " + y + " = " + multiplication.getResult());
        System.out.println(x + " / " + y + " = " + division.getResult());

        MixList.alphabeticalListSorter(stringsAndIntList);

        System.out.println("Words that contain letter 'e' go first:");
        sortedByEList.forEach(System.out::println);

        System.out.println("Replacing letter 'a' to '4':");
        replacedLettersList.forEach(System.out::println);

        MixList.filterNumericStrings(stringsAndIntList);

    }
}
