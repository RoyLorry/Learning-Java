package com.java.learning.interfaceDemo;

public class Boss implements Callback {

    @Override
    public void callbackEvent() {
        System.out.println("子线程全部完成");
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        Employee employee = new Employee(boss);
        employee.doWork();
    }
    
}