package main.java.workbook2.varcompare;

import java.util.Scanner;

class Car {
    static int totalCars = 0;
    String name;
    Car(String name) {
        this.name = name;
        // TODO: totalCars 증가
        totalCars++;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();
        Car c1 = new Car(n1);
        Car c2 = new Car(n2);
        Car c3 = new Car(n3);
        System.out.println(c1.name + " " + Car.totalCars);
        System.out.println(c2.name + " " + Car.totalCars);
        System.out.println(c3.name + " " + Car.totalCars);
    }
}
