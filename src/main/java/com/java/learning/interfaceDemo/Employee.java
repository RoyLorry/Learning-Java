package com.java.learning.interfaceDemo;

public class Employee {
    Callback callback;
    
    public Employee(Callback callback) {
        this.callback = callback;
    }

    public void doWork(){
        // while work done
        System.out.println("Work done.");
        callback.callbackEvent();
    }
}