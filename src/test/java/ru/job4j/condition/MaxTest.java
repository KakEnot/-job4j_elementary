package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int one = 1;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To1Then5() {
        int one = 5;
        int two = 1;
        int result = Max.max(one, two);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To5Then5() {
        int one = 1;
        int two = 5;
        int result = Max.max(one, two);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To1Then1() {
        int one = 1;
        int two = 1;
        int result = Max.max(one, two);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2to3Then3() {
        int one = 1;
        int two = 2;
        int three = 3;
        int result = Max.max(one, two, three);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0To0to0Then0() {
        int one = 0;
        int two = 0;
        int three = 0;
        int result = Max.max(one, two, three);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To1to0Then3() {
        int one = 1;
        int two = 2;
        int three = 3;
        int result = Max.max(one, two, three);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2to3to4Then4() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int result = Max.max(one, two, three, four);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0To0to0to0Then0() {
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int result = Max.max(one, two, three, four);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To3to2to1Then4() {
        int one = 4;
        int two = 3;
        int three = 2;
        int four = 1;
        int result = Max.max(one, two, three, four);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}
