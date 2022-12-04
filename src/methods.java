public class methods {
    static int add(int a, int b) {
        return(a + b);
    }
    public static void main(String[] args) {
        myMethod();
        System.out.println(add(4, 7));
        myMethod();
        checkAge(17);
        checkAge(20);
    }

    public static void myMethod() {
        System.out.println("Hello From myMethod()");
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
