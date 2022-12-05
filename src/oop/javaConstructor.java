package oop;

// A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. 
// It can be used to set initial values for object attributes

public class javaConstructor {
    int num; // class attribute

    int v;

    /**
    // create class constructor for the `javaConstructor` class
    public javaConstructor() {
        int num = 10; // Set the initial value for the class attribute num

        //int numb;
        
        // initializing via users using parameter
    }
    */

    public javaConstructor(int u) {
        v = u;
    }

    public static void main(String[] args) {
        //javaConstructor myObj = new javaConstructor(); // Create an object of class 'javaConstructor' (This will call the constructor)
        //System.out.println(myObj.num);

        //  you are not able to set initial values for object attributes.
        //int m = myObj.numb = 5; // 

        // constructor parameters
        // so that we can initializing the value of the object attributes.
        javaConstructor cObj = new javaConstructor(34);
        int x = cObj.v;
        System.out.println("v= " + x);
    }
}
