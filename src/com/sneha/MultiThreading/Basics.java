package com.sneha.MultiThreading;

public class Basics implements Runnable{ // implementing java's built in interface runnable(we can't directly make an object of an interface thus we make object of the class that implements it).
    public void run(){                // we provide this method the task our thread has to do.
        System.out.println("Thread is running");
    }

    static void main(String[] args) {
        Basics obj = new Basics();
        Thread t = new Thread(obj);   // here thread is java's built in class and we are creating an object
        t.start();
    }

}
