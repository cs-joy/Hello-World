package oop;

// static vs. public

public class classMethod {
    // static method
    static void staticMethod() {
        System.out.println("Static Mehtod");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

    public static void main(String[] args) {
        staticMethod(); // Static methods can be called without creating objects

        //publicMethod(); // not accessible without creating object
        classMethod pObj = new classMethod();
        pObj.publicMethod(); // Public methods must be called by creating objects
    }
}
