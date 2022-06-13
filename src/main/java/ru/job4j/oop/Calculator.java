package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public int multiple(int y) {
        return x * y;
    }

    public double sumAllOperation(int y) {
        return minus(y) + divide(y) + sum(y) + multiple(y);
    }

    public static void main(String[] args) {
        int rslMinus = minus(8);
        Calculator calculatorDivide = new Calculator();
        int rslDivide = calculatorDivide.divide(10);
        double rslSumAll = calculatorDivide.sumAllOperation(6);
        int rslSum = sum(8);
        int rslMultiple = calculatorDivide.multiple(3);
        System.out.println(rslMinus + System.lineSeparator()
                + rslDivide + System.lineSeparator() + rslSumAll
                + System.lineSeparator() + rslSum + System.lineSeparator() + rslMultiple);
    }
}
