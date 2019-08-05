package com.java.learning.basictype;

public class IncrementAndDecrement {

    class A {}
    class B {}


    public static void method1() {
        int i = 1;
        i = i++; // 等价于 { temp = i; i = i + 1; return temp;}
        System.out.println(i);
    }

    public static void main(String[] args) {
        method1();
    }
}