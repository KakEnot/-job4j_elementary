package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void allTheSame() {
        int[] data = new int[]{1, 1, 1, 1, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 1, 1, 1, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenEmpty() {
        int[] data = new int[]{};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenThree() {
        int[] data = new int[]{-11, -10, -1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-11, -10, -1};
        assertThat(result).containsExactly(expected);
    }
}