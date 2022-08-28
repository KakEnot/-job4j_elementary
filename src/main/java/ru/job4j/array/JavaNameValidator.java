package ru.job4j.array;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (!name.isEmpty()) {
            char[] array = name.toCharArray();
            if (!isUpperCase(array[0]) && !isDigit(array[0]) && !isSpecialSymbol(array[0])) {
                for (int i = 1; i < array.length; i++) {
                    return isSpecialSymbol(array[i]) || isUpperLatinLetter(array[i]) || isLowerLatinLetter(array[i]);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 64 && code < 91;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 96 && code < 123;
    }
}
/*Переменная должна начинаться на строчную латинскую букву.
Для того, чтобы проверить является ли символ числом, мы будем использовать метод isDigit() класса Character:
* */