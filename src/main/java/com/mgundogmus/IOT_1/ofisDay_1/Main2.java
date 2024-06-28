package com.mgundogmus.IOT_1.ofisDay_1;

public class Main2 {
    //psvm
    public static void main(String[] args) {
        Rectangle rectangleCopy;
        rectangleCopy = new Rectangle();

        rectangleCopy.kisaKenar = 20;
        rectangleCopy.uzunKenar = 37.3;

        double alan = rectangleCopy.calculateArea(); // alan hesaplanıyor
        double cevre = rectangleCopy.calculateCircumference(); // çevre hesaplanıyor


        System.out.println("Alan  : " + alan);
        System.out.println("Çevre   : " + cevre);
    }
}
