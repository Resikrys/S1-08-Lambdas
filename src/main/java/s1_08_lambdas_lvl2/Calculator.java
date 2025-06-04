package s1_08_lambdas_lvl2;

public class Calculator {


    public Operation addition = (x, y) -> x + y;
    public Operation substraction = (x, y) -> x - y;
    public Operation multiplication = (x, y) -> x * y;
    public Operation division = (x, y) -> x / y;

}
