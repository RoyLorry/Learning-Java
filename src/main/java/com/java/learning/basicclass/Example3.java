package com.java.learning.basicclass;

/**
 * 单例类加载初始化
 * 
 */
class Singleton {
    private static Singleton singleton = new Singleton();

    public static int count1;
    public static int count2 = 0;

    private Singleton() {
        count1++;
        count2++;
    }

    public static Singleton getInstance() {
        return singleton;
    }
}

public class Example3 {
    public static void main(String[] args) {
        System.out.println(Singleton.count1);
        System.out.println(Singleton.count2);
    }
}