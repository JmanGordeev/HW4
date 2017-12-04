package com.gordeev.jman;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * i + 5);
        }
        int[] arr2 = Arrays.copyOf(arr, arr.length * 2);
        System.out.println(Arrays.toString(arr));
        for (int i = 15; i < arr2.length; i++) {
            arr2[i] = arr[i - 15] * 2;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
