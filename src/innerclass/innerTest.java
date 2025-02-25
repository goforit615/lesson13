package innerclass;

class OutClass {        // 외부 클래스
    private int num = 10;   // 외부 클래스 private 변수
    private static int sNum = 20;     // 외부 클래스 정적 변수

    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {
        int inNum = 100;
        // static in sInNum = 200;

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
        }

        //static void sTest() {
        //}
    }
    public void usingClass() {
        inClass.inTest();
    }
}

public class innerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();
    }
}
