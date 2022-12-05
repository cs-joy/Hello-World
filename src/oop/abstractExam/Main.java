package oop.abstractExam;

// abstract class
abstract class Main {
    public String name = "John Doe";
    public int age = 24;
    public abstract void study(); // abstract method
}

// // Subclass (inherit from Main)
class Student extends Main {
    public int graduationYear = 2024;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}