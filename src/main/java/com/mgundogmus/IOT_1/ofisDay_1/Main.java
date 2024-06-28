package com.mgundogmus.IOT_1.ofisDay_1;

public class Main {
    //psvm duası
    public static void main(String[] args) {
        Rectangle kenarlar;
        kenarlar = new Rectangle();
        kenarlar.uzunKenar = 25.7;
        kenarlar.kisaKenar = 5;

        double alan = kenarlar.calculateArea(); // alan hesaplanıyor
        double cevre = kenarlar.calculateCircumference(); // çevre hesaplanıyor

        System.out.println("Alan  : " + alan);
        System.out.println("Çevre   : " + cevre);
    }
}
