package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 5, 2, 4, 7, 1, 3, 19};
        int i = 0;
        for (int a : arr) {
            if (a % 2 != 0) {
                i++;
            }
        }
        System.out.println(i);
    }
}
