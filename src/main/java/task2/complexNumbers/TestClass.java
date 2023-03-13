package task2.complexNumbers;

public class TestClass {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);

        ComplexNumber sum = a.add(b);
        ComplexNumber difference = a.subtract(b);
        ComplexNumber product = a.multiply(b);
        double abs = a.abs();
        String string = a.toString();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + sum); // a + b = 4+6i
        System.out.println("a - b = " + difference); // a - b = -2-2i
        System.out.println("a * b = " + product); // a * b = -5+10i
        System.out.println("|a| = " + abs);

    }

}
