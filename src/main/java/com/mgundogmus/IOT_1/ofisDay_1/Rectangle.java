package com.mgundogmus.IOT_1.ofisDay_1;

public class Rectangle{ //Dikdörtgen
    public double kisaKenar; // Eğer sonuç ya da kullanılacak değer virgüllü ise double kullanıyoruz.
    public double uzunKenar;

    public double calculateCircumference(){ // Çevre hesaplayan metod
        return 2*(uzunKenar+kisaKenar);
    }

    public double calculateArea(){ // Alan hesaplayan metod
        return uzunKenar*kisaKenar;
    }

    // ToDo: Homework: Scanner kulanılarak uzun kenar ve kısa kenar değerlerinin kullanıcadan alınarak hesaplamaların yapılması.
    //

}
