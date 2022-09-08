package ru.job4j.array;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (!name.isEmpty()) {
            char[] array = name.toCharArray();
            if (!isUpperCase(array[0]) && !isDigit(array[0]) && !isSpecialSymbol(array[0])) {
                for (int i = 1; i < array.length; i++) {
                    if (isSpecialSymbol(array[i]) && isUpperLatinLetter(array[i]) && isLowerLatinLetter(array[i])) {
                        return false;
                    }
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