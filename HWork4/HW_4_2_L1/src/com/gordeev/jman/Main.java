package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива " );
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l ; i++) {
            System.out.println("Введите " + i + " - тый элемент массива :");
            arr[i] = sc.nextInt();
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
