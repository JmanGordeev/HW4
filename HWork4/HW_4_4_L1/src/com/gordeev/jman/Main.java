package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string ");
        String s = sc.nextLine();
        char[] b = s.toCharArray();
        char bb = 'b';
        int count = 0;
        for (char symbol : b) {
            if (symbol == bb) {
                count++;
            }
        }
        System.out.println("The symbol 'b' was used " + count);
    }
}
