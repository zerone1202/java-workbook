package main.java.workbook2.varscope;

// 메서드 내부에서 선언된 지역변수는 메서드가 종료되면 사라짐을 보여주는 프로그램을 작성하시오. 메서드 호출 후 지역변수에 접근하려 하면 오류가 발생해야 한다.
// 지역변수는 메서드 내부에서만 접근 가능하므로, 메서드 외부에서 출력하려고 하면 주석 등으로 설명합니다.
public class Q2 {
    static void showLocal() {
        String msg = "inside";
        System.out.println(msg);
    }
    public static void main(String[] args) {
        showLocal();
        // TODO: msg 변수에 접근하려고 하면 컴파일 오류
//        System.out.println(msg);
    }
}