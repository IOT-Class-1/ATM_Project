package com.mgundogmus.IOT_1.ofisDay_2;

public class Engineer extends Employee{  // Mühendis sınıf miras alıyor Personel Sınıfından

    public Engineer(String name, double salary, int age) {
        super(name, salary, age);
        // İsim, Maaş ve Yaş bilgilerini
        // Personel sınıfından miras aldığı için "super" anahtar kelimesi ile çağırıyouz.
    }

    public double getAnnualBonus() {
        return super.salary * .05;
    }
}