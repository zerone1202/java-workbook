package main.java.workbook2.varscope;

// 클래스 Sample에서 지역변수, 인스턴스 변수, 클래스 변수를 선언하고, main 메서드에서 이들의 사용 예를 출력하는 프로그램을 작성하시오.
// 클래스 변수는 static 키워드를 사용합니다.
class Sample {
    public static String classVar = "class"; // 클래스 변수 (static 키워드 사용)
    public String instanceVar = "instance"; // 인스턴스 변수 (객체마다 고유한 값)
    void printLocal() {
        String localVar = "local";
        // TODO: localVar 출력
        System.out.println(localVar); // 지역 변수 출력
    }
}

public class Q1 {
    public static void main(String[] args) {
        Sample s = new Sample(); // Sample 클래스의 인스턴스 생성
        s.printLocal(); // 지역 변수 출력
        // TODO: instanceVar와 classVar 출력
        System.out.println(s.instanceVar); // 인스턴스 변수 출력 (객체를 통해 접근)
        System.out.println(Sample.classVar); // 클래스 변수 출력 (클래스명으로 접근하는 것이 일반적)

    }
}