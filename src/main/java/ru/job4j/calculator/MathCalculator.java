package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDevision(double first, double second) {
        return difference(first, second) + devision(first, second);
    }

    public static double allSum(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + difference(first, second) + devision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}