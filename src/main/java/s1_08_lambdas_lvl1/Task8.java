package s1_08_lambdas_lvl1;

import static s1_08_lambdas_lvl1.PrintStringList.namesWithO;

public class Task8 {
    public static void main(String[] args) {

        namesWithO.forEach(System.out::println);
    }
}
