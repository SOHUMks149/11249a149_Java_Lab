import mypackage.Calculator;

public class TestPackage {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println("Addition = " + obj.add(10, 20));
        System.out.println("Multiplication = " + obj.multiply(10, 20));
    }
}