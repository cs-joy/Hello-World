public class methods {
    static int add(int a, int b) {
        return(a + b);
    }
    public static void main(String[] args) {
        myMethod();
        System.out.println(add(4, 7));
        myMethod();
    }

    public static void myMethod() {
        System.out.println("Hello From myMethod()");
    }
}
