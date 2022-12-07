package oop.synchronizedModifier;

class Table2 {
    synchronized void printTable(int n) { // synchronized method
        for(int i=1; i<=5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


class Thread1 extends Thread {
    Table2 t;
    Thread1(Table2 obj) {
        this.t = obj;
    }

    public void run() {
        t.printTable(5);
    }
}


class Thread2 extends Thread {
    Table2 t;
    Thread2(Table2 obj) {
        this.t = obj;
    }

    public void run() {
        t.printTable(100);
    }
}


public class TestSynchronization2 {
    public static void main(String[] args) {
        Table2 object = new Table2();

        Thread1 t1 = new Thread1(object);
        Thread2 t2 = new Thread2(object);

        t1.start();
        t2.start();
    }
}
