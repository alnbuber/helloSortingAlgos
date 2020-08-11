package com.schmollgruber.algorithms.services.threading;

public class RunnableDemo implements Runnable{

    private Thread t;
    private String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running " + this.threadName);
        try {
            for (int i = 4; i >0; i--) {
                System.out.println("Thread: " + this.threadName + ", " + i);
                // action
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: " + this.threadName + " interrupted." );
        }
        System.out.println("Thread: " + this.threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            this.t = new Thread(this, threadName);
            t.start();
        }
    }
}
