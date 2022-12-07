package oop.transientModifier;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;
    transient int age; // //Now it will not be serialized

    public Student (int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}


public class PersistExample {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(211,"ravi",22); // creeate object

        // writing object into file
        FileOutputStream fos = new FileOutputStream("f.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.flush();
        oos.close();
        
        System.out.println("Success!");
    }
}
