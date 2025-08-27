package main.java.workbook2.varcompare;

import java.util.Scanner;

class ChatRoom {
    static int totalUsers = 0;
    String name;
    int messagesSent = 0;
    ChatRoom(String name) {
        this.name = name;
    }
    void sendMessages(int n) {
        // TODO: messagesSent와 ChatRoom.totalUsers 증가
        messagesSent += n;
        ChatRoom.totalUsers++;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        int m1 = sc.nextInt();
        String name2 = sc.next();
        int m2 = sc.nextInt();
        ChatRoom u1 = new ChatRoom(name1);
        ChatRoom u2 = new ChatRoom(name2);
        u1.sendMessages(m1);
        u2.sendMessages(m2);
        // TODO: 각 사용자 이름과 messagesSent, ChatRoom.totalUsers 출력
        System.out.println("user1 " + m1 + " " + ChatRoom.totalUsers);
        System.out.println("user2 " + m2 + " " + ChatRoom.totalUsers);
    }
}
