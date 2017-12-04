package com.gordeev.jman;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }
}

