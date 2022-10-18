package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ScienceCalculator scienceCalculator = new ScienceCalculator();
        RootCalculator rootCalculator = new RootCalculator();

        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.subtract(2, 3));
        System.out.println(calculator.multiply(2, 3));
        System.out.println(calculator.divide(80, 5));
        System.out.println(scienceCalculator.sin(90));
        System.out.println(rootCalculator.sqrt(9));
        System.out.println(scienceCalculator.add(5,1));
    }
}
