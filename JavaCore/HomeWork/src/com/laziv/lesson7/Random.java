package com.laziv.lesson7;

public class Random {
    public static int getRandomNum(int min, int max){
        max++;
        int r = (int) (Math.random() * (max - min)) + min;
        return r;
    }
}