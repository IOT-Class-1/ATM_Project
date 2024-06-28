package com.mgundogmus.ofisDay_1.Rectangle;

public class Rectangle{
    public double kisaKenar; // Eğer sonuç ya da kullanılacak değer virgüllü ise double kullanıyoruz.
    public double uzunKenar;

    public double calculateCircumference(){ // Çevre hesaplayan metod
        return 2*(uzunKenar+kisaKenar);
    }

    public double calculateArea(){ // Alan hesaplayan metod
        return uzunKenar*kisaKenar;
    }
}
