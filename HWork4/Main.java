package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle ");
        int angle = sc.nextInt();
        if (angle != 90 && angle != 180 && angle != 270 && angle != 360) {
            System.out.println("Enter the correct angle (90,180,270)");
        }

        if (angle == 90) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = array[i][i];
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }
        }

        if (angle == 180) {
            for (int i = 0; i < array.length; i++) {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = array[i][j];
                    System.out.print(array[i][j]);

                }
                System.out.println();
            }
        }

        if (angle == 270) {
            for (int i = array.length - 1; i >= 0; i--) {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = array[i][i];
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }
        }
    }
}
