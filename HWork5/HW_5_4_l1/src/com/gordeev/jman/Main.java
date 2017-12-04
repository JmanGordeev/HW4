package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrey = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Enter element");
        int element = sc.nextInt();
        int index = elementSearch(arrey, element);

        if (index != -1) {
            System.out.println("Index of element " + index);
        } else {
            System.out.println("-1");
        }
    }

    public static int elementSearch(int[] a, int b) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
}
