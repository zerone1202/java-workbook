package main.java.workbook2.varscope;

import java.util.Scanner;

class Bank {
    static int totalBalance = 0;
    int balance;
    Bank(int balance) {
        this.balance = balance;
        totalBalance += balance;
    }
    void deposit(int amount) {
        // TODO: balance와 totalBalance 증가
        balance = balance + amount;
        totalBalance += amount;
    }
    void withdraw(int amount) {
        // TODO: balance와 totalBalance 감소
        balance = balance - amount;
        totalBalance -= amount;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal1 = sc.nextInt();
        int bal2 = sc.nextInt();
        Bank acc1 = new Bank(bal1);
        Bank acc2 = new Bank(bal2);
        String op1 = sc.next();
        int id1 = sc.nextInt();
        int amt1 = sc.nextInt();
        // 첫 번째 명령 처리
        if (op1.equals("deposit")) {
            if (id1 == 1) acc1.deposit(amt1);
            else acc2.deposit(amt1);
        } else {
            if (id1 == 1) acc1.withdraw(amt1);
            else acc2.withdraw(amt1);
        }

        // 두 번째 명령 처리 후 Bank.totalBalance 출력
        String op2 = sc.next();
        int id2 = sc.nextInt();
        int amount2 = sc.nextInt();

        if (op2.equals("deposit")) {
            if (id2 == 1) acc1.deposit(amount2);
            else acc2.deposit(amount2);
        } else {
            if (id2 == 1) acc1.withdraw(amount2);
            else acc2.withdraw(amount2);
        }

        System.out.println(Bank.totalBalance);
    }
}