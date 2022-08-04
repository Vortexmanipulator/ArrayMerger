package com.sparta.dr;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    @DisplayName("both arrays have the same number of values")
    void bothArraysHaveTheSameNumberOfValues() {
        int[] a1 = new int[]{1, 3, 5, 7, 9};
        int[] a2 = new int[]{2, 4, 6, 8, 10};
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]";
        String answer = Arrays.toString(ArrayMerger.arrayMerge(a1, a2));
        Assertions.assertEquals(expected, answer);
    }

    @Test
    @DisplayName("Array one has more values")
    void arrayOneHasMoreValues() {
        int[] a1 = new int[]{1, 3, 5, 7, 9, 11, 13, 15};
        int[] a2 = new int[]{2, 4, 6, 8, 10};
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15]";
        String answer = Arrays.toString(ArrayMerger.arrayMerge(a1, a2));
        Assertions.assertEquals(expected, answer);
    }

    @Test
    @DisplayName("Array two has more values")
    void arrayTwoHasMoreValues() {
        int[] a1 = new int[]{1, 3, 5, 7, 9};
        int[] a2 = new int[]{2, 4, 6, 8, 10, 12, 14, 16};
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16]";
        String answer = Arrays.toString(ArrayMerger.arrayMerge(a1, a2));
        Assertions.assertEquals(expected, answer);
    }

    @Test
    @DisplayName("Array has negative vallues")
    void arrayHasNegativeVallues() {
        int[] a1 = new int[]{-5, -2, 5, 7, 9};
        int[] a2 = new int[]{-15, -4, 6, 8, 10, 12, 14, 16};
        String expected = "[-15, -5, -4, -2, 5, 6, 7, 8, 9, 10, 12, 14, 16]";
        String answer = Arrays.toString(ArrayMerger.arrayMerge(a1, a2));
        Assertions.assertEquals(expected, answer);
    }

    @Test
    @DisplayName("Arrays have the same values")
    void arraysHaveTheSameValues() {
        int[] a1 = new int[]{-15, -4, 6, 8, 10, 12, 14, 16};
        int[] a2 = new int[]{-15, -4, 6, 8, 10, 12, 14, 16};
        String expected = "[-15, -15, -4, -4, 6, 6, 8, 8, 10, 10, 12, 12, 14, 14, 16, 16]";
        String answer = Arrays.toString(ArrayMerger.arrayMerge(a1, a2));
        Assertions.assertEquals(expected, answer);
    }
}