package com.mgundogmus.ofisDay_1.Rectangle;

public class Main2 {
    public static void main(String[] args) {
        Rectangle rectangle2;
        rectangle2 = new Rectangle();

        rectangle2.uzunKenar = 45.8;
        rectangle2.kisaKenar = 6.5;

        double alani = rectangle2.calculateArea();
        double cevresi = rectangle2.calculateCircumference();

        System.out.println("Alan   :  " + alani);
        System.out.println("Cevresi   :  " + cevresi);
    }
}
