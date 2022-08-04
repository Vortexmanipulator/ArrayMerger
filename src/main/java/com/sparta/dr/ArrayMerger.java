package com.sparta.dr;

public class ArrayMerger {
    public ArrayMerger() {
    }

    static int[] arrayMerge(int[] array1, int[] array2) {
        int count1 = 0;
        int count2 = 0;
        int[] array3 = new int[array1.length + array2.length];

        for(int i = 0; i < array3.length; ++i) {
            if (count1 < array1.length && count2 < array2.length) {
                if (array1[count1] < array2[count2]) {
                    array3[i] = array1[count1];
                    ++count1;
                } else if (array2[count2] < array1[count1]) {
                    array3[i] = array2[count2];
                    ++count2;
                } else if (array2[count2] == array1[count1]) {
                    array3[i] = array1[count1];
                    array3[i + 1] = array2[count2];
                    ++count1;
                    ++count2;
                    ++i;
                }
            } else if (count2 == array2.length) {
                array3[i] = array1[count1];
                ++count1;
            } else {
                array3[i] = array2[count2];
                ++count2;
            }
        }

        return array3;
    }
}