package main.java.workbook2.varcompare;

import java.util.Scanner;

class Student {
    static int studentCount = 0;
    int id;
    String name;
    Student(String name) {
        this.name = name; // 생성자
        // TODO: studentCount 증가 후 id에 할당
        id = ++studentCount;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            Student stu = new Student(name);
            System.out.println(stu.name + " " + stu.id);
        }
    }
}