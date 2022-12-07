package oop.transientModifier;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DePersist {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
        Student s = (Student)in.readObject();
        System.out.println("id= " + s.id + "\n" + "name= " + s.name + "\n" + "age= " + s.age);
        in.close();
    }
}
