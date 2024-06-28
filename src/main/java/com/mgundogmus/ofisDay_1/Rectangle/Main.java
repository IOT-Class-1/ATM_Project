package com.mgundogmus.ofisDay_1.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle;
        rectangle = new Rectangle();

        rectangle.uzunKenar = 30.7;
        rectangle.kisaKenar = 12.3;

        double alani = rectangle.calculateArea();
        double cevresi = rectangle.calculateCircumference();

        System.out.println("Alan   :  " + alani);
        System.out.println("Cevresi   :  " + cevresi);
    }
}
