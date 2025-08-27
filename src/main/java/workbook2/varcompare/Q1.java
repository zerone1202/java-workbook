package main.java.workbook2.varcompare;

class Counter {
    static int count = 0;
    int id;
    Counter() {
        // TODO: count 증가 후 id에 할당
        id = ++count;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println(c1.id + " " + Counter.count);
        Counter c2 = new Counter();
        System.out.println(c2.id + " " + Counter.count);
    }
}
