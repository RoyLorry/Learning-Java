package com.java.learning.basicclass;

public class Example1 {
    public static void main(String[] args){
        new Example1().test();
    }

    public void test() {
        // 本质上是调用的父类Object类的final getClass方法，然后该方法返回对象在运行时的类型
        // 可以通过getSuperClass获得父类名称
        System.out.println(super.getClass().getName());
    }

    public void createObject() {
        Example1 e1 = new Example1();
        // Example1 e2 = Class.forName("com.java.learning.basicclass.Example1").newInstance();

    }
}