package com.java.learning.basicclass;

/**
 * 单例类加载初始化
 * 类加载的时候在准备过程中为类的静态变量分配内存并初始化默认值 singleton=null，count1=0，count2=0
 * 类初始化时为类的静态变量赋值和执行静态代码快
 * singleton 赋值为 new SingleTon() 调用类的构造方法
 * 调用类的构造方法后 count=1 且 count2=1
 * 继续为 count1 与 count2 赋值，此时 count1 没有赋值操作
 * 所以 count1 为 1，但是 count2 执行赋值操作就变为 0
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