package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        double b = 10.5;
        String c = "Concat ";
        System.out.println(getSumm(a, b, c));
    }

    public static String getSumm(int a, double b, String s) {
        String summ = s + (a + b);
        return summ;
    }
}
