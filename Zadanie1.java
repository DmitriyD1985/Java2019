package com.company;

public class Zadanie1 {

    public static void main(String[] args) {
        int a=10;
        int b=8;
        String text = "0";
        if (a<0 || b<0) {
            text = "Есть  отрицательное число";
            System.out.println(text);
            }
        if (b!=0) {
            float result1 = (float) a/b;
            text = "Результат деления: " + result1;
            System.out.println(text);
        }
        if (b>a) {
            text = "Второе число больше первого";
            System.out.println(text);
        }
        if (b<a) {
            text = "Первое число больше второго";
            System.out.println(text);
        }
        if (a%2==0) {
            text = "число "+a+" - четное";
            System.out.println(text);
        }
                }
    }