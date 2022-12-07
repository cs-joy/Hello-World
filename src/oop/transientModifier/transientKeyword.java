package oop.transientModifier;

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
    }
}
