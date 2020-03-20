package com.laziv.lesson5.task4;

public class Rectangle {
    private int width;
    private int length;
    private int square;

    public Rectangle(int width, int length) {
        this(width * length);
        this.width = width;
        this.length = length;
    }

    public Rectangle(int square) {
        this.square = square;
    }
}