package task2.SnilsValidator;

public class TestClass {

    public static void main(String[] args) {
        SnilsValidator snilsValidator = new SnilsValidatorImpl();
        System.out.println(snilsValidator.validate("90114404441")); //true
        System.out.println(snilsValidator.validate("01468870570")); //false
        System.out.println(snilsValidator.validate("48095351208")); //true
        System.out.println(snilsValidator.validate("480953a1208")); // false
    }
}
