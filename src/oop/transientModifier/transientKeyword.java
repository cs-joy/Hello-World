package oop.transientModifier;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class transientKeyword implements Serializable {
    // normal variables
    int i=10, j = 20;

    // transient variables
    transient int k = 30;

    // use of transient no impact here
    transient final int l = 40;
    transient static int m = 50;


    public static void main(String[] args) throws Exception{
        transientKeyword input = new transientKeyword();

        // serialization
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);

        // deserialization
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        transientKeyword output = (transientKeyword)ois.readObject();

        System.out.println("i= " + output.i);
        System.out.println("j= " + output.j);
        //System.out.println("k= " + output.k);
        System.out.println("l= " + output.l);
        System.out.println("m= " + output.m);
    }
}
