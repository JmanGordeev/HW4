package com.gordeev.jman;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        int temp = 0;
        System.out.println("Было  "+Arrays.toString(array));
        for (int i = 0; i <(array.length-1)/2 ; i++) {
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("Стало "+Arrays.toString(array));
    }
}
