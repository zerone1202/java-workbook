package main.java.workbook2.methodcompare;

import javax.swing.*;
import java.util.Scanner;

class StringUtil {
    static boolean isPalindrome(String s) {
        // TODO: 회문 여부 판단
        if (s == null || s.length() == 0)
            return true;

        int a = 0;
        int b = s.length() - 1;
        while (a < b) {
            if (s.charAt(a) != s.charAt(b))
                return false;
            a++;
            b--;
        }
        return true;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // TODO: StringUtil.isPalindrome 호출 후 출력
        System.out.println(StringUtil.isPalindrome(str));
    }
}
