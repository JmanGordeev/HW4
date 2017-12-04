package com.gordeev.jman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.nextLine();
        String regex = " ";
        int count = wordCount(s, regex);
        System.out.println(count + " words");
    }

    public static int wordCount(String s, String b) {
        String[] sArr = s.split(b);
        return sArr.length;
    }
}
