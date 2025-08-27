package main.java.workbook2.varcompare;

import java.util.Scanner;

class Product {
    static int totalSold = 0;
    int stock;
    Product(int stock) {
        this.stock = stock;
    }
    void sell(int quantity) {
        // TODO: stock 감소, totalSold 증가
        stock -= quantity;
        totalSold += quantity;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialStock = sc.nextInt();
        Product p = new Product(initialStock);
        for (int i = 0; i < 2; i++) {
            String cmd = sc.next();
            int q = sc.nextInt();
            p.sell(q);
        }
        // TODO: p.stock과 Product.totalSold 출력
        System.out.print(p.stock + " ");
        System.out.println(Product.totalSold);
    }
}
