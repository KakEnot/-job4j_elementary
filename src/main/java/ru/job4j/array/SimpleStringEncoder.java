package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 0; i < input.length(); i++) {

            if (i < input.length() - 1) {
                if (symbol == input.charAt(i + 1)) {
                    counter += 1;
                } else {
                    result += symbol;
                    symbol = input.charAt(i + 1);
                    if (counter > 1) {
                        result += counter;
                    }
                    counter = 1;
                }
            } else {
                if (symbol == input.charAt(i)) {
                    result += symbol;
                    if (counter > 1) {
                        result += counter;
                    }
                } else {
                    result += symbol;
                }
            }
        }
        return result;
    }
}
