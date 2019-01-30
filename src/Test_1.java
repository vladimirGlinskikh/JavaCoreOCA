public class Test_1 {

    public static void main(String[] args) {
        Test30 test = new Test30();
        System.out.println(((Test10) test).a);
        System.out.println(((Test20) test).a);
        test.abc();
        ((Test10) test).abc();
    }
}

class Test10 {
    int a = 5;

    void abc() {
        System.out.println("ok1");
    }
}

class Test20 extends Test10 {
    int a = 20;

    void abc() {
        System.out.println("ok2");
    }
}

class Test30 extends Test20 {
    int a = 30;

    void abc() {
        System.out.println("ok3");
    }
}
