package main.java.workbook2.varscope;

// 클래스 Demo에 static 초기화 블록과 인스턴스 초기화 블록을 사용하여 변수값을 설정하는 프로그램을 작성하고, 객체 생성 시 실행 순서를 출력하시오.
// static 블록은 클래스 로딩 시 실행되고, 인스턴스 블록은 객체 생성 시 실행됩니다.
public class Q4 {
    static {
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }
    Q4() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        Q4 d = new Q4();
        Q4 d2 = new Q4();
    }
}

// static block은 딱 1번 실행됨