package com.laziv.lesson3;

public class Rectangle {
    public int width;
    public int length;

    public Rectangle() {
        width = 45;
        length = 100;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int calculateSquare() {
        return width * length;
    }

    public int calculatePerimeter() {
        return 2 * (width + length);
    }


    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Периметр першого прямокутника = " + rectangle1.calculatePerimeter());
        System.out.println("Площа першого прямокутника = " + rectangle1.calculateSquare());

        Rectangle rectangle2 = new Rectangle(120, 150);
        System.out.println("Периметр другого прямокутника = " + rectangle2.calculatePerimeter());
        System.out.println("Площа другого прямокутника = " + rectangle2.calculateSquare());

    }
}