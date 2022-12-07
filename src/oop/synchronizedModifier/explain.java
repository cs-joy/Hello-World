package oop.synchronizedModifier;

/**
 * Synchronization in java is the capability to control the access of multiple threads to any shared resource. 
 * In the Multithreading concept, multiple threads try to access the shared resources at a time to produce inconsistent results. 
 * The synchronization is necessary for reliable communication between threads.
 */

///// general form of a synchronized block:
// Only one thread can execute at a time. 
// sync_object is a reference to an object
// whose lock associates with the monitor. 
// The code is said to be synchronized on
// the monitor object
/*
synchronized(sync_object)
{
   // Access shared variables and other
   // shared resources
}
*/
// send a message
class Sender {
    public synchronized void send(String msg) {
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}

// send a message using threads
class ThreadSend extends Thread {
    private String msg;
    Sender sender;

    // Receives a message object and a string
    // message to be sent
    ThreadSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    public void run() {
        // only one thread can send a message
        // at a time
        synchronized(sender) {
            // synchronizing the send object
            sender.send(msg);
        }
    }
}

public class explain {
    public static void main(String[] args) {
        Sender send = new Sender();
        ThreadSend S1 = new ThreadSend(" Hi ", send);
        ThreadSend S2 = new ThreadSend(" Bye ", send);

        // start two threads of ThreadSend type
        S1.start();
        S2.start();

        // wait for threads to end
        try {
            S1.join();
            S2.join();
        }
        catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
