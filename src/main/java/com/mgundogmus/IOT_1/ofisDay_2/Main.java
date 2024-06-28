package com.mgundogmus.IOT_1.ofisDay_2;

public class Main {
    public static void main(String[] args){
        Engineer employeeOne = new Engineer("Sally Roberts", 80000, 34);

        Salesperson employeeTwo = new Salesperson("Matt Johnson", 65000, 32, .25);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getCommissionPercentage();

        System.out.println(employeeOne.salary);  // 80000
        System.out.println(employeeOne.getAnnualBonus()); //4000
        System.out.println(employeeTwo.salary); // 78000
        System.out.println(employeeTwo.getCommissionPercentage()); //0.25
// ToDo: raiseCmmission metodunu çağırma
    }
}


// 80000.0
//4000.0
//78000.0
//0.4

