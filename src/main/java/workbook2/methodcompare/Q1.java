package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Calculator {
    static int add(int a, int b) {
        // TODO: 덧셈 결과 반환
        int add = a + b;
        return add;
    }
    int multiply(int a, int b) {
        // TODO: 곱셈 결과 반환
        int multiply = a * b;
        return multiply;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = Calculator.add(x, y);
        Calculator calc = new Calculator();
        int prod = calc.multiply(x, y);
        // TODO: sum과 prod 출력
        System.out.println(sum + " " +prod);
    }
}
