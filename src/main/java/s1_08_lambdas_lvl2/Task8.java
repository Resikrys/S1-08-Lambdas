package s1_08_lambdas_lvl2;

import static s1_08_lambdas_lvl2.IntegerFilter.sortedNums;
import static s1_08_lambdas_lvl2.ListFilter.namesWithAAndLength3;
import static s1_08_lambdas_lvl2.MixList.*;

public class Task8 {
    public static void main(String[] args) {
        float x = 12F;
        float y = 2.5F;
        Calculator calculator = new Calculator();


        namesWithAAndLength3.forEach(System.out::println);

        System.out.println(String.join(", ", sortedNums));


        System.out.println(x + " + " + y + " = " +
                calculator.addition.getResult(x, y));
        System.out.println(calculator.substraction.getResult(x, y));
        System.out.println(x + " * " + y + " = " + calculator.multiplication.getResult(3, 324));
        System.out.println(x + " / " + y + " = " + calculator.division.getResult(x, y));

        MixList.alphabeticalListSorter(stringsAndIntList);

        System.out.println("Words that contain letter 'e' go first:");
        sortedByEList.forEach(System.out::println);

        System.out.println("Replacing letter 'a' to '4':");
        replacedLettersList.forEach(System.out::println);

        MixList.filterNumericStrings(stringsAndIntList);

    }
}
