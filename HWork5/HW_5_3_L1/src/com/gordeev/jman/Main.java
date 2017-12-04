package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width ");
        int width = sc.nextInt();
        System.out.println("Enter height ");
        int height = sc.nextInt();

        drawSquare(width, height);
    }

    public static void drawSquare(int a, int b) {
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a || j == 0 || j == b - 1) {
                    System.out.print("*");

                } else if (i > 0 && i < a) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
