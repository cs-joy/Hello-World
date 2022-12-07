package oop.synchronizedModifier;

// example of synchronized method by using annonymous class

class List {
    synchronized void printList(int number) { // synchronized method
        for(int i=1; i<=5; i++) {
            System.out.println(number*i);
            try {
                Thread.sleep(400);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


public class TestSynchronization3 {
    public static void main(String[] args) {
        final List obj = new List();

        Thread t1 = new Thread() {
            public void run() {
                obj.printList(5);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                obj.printList(100);
            }
        };

        t1.start();
        t2.start();
    }
}
