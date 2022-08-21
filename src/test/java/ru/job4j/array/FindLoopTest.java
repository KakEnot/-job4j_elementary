package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{1, 2, 3, 4, 5, 6};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
        /* Здесь нужно дописать тест, когда в массиве не найдено число 10.
        Можно искать любое другое число, корректно изменив при этом название теста */
    }

    @Test
    public void whenArrayHas3Then0() {
        int[] data = new int[]{1, 2, 3};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}