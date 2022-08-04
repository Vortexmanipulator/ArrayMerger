package com.sparta.dr;

import java.util.Arrays;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 10, 15, 23, 40, 41, 46, 99, 200, 300, 400};
        int[] array2 = new int[]{4, 7, 12, 16};
        System.out.println(Arrays.toString(ArrayMerger.arrayMerge(array1, array2)));
    }
}
