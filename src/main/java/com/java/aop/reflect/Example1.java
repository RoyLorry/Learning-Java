package com.java.aop.reflect;

import java.lang.reflect.Method;

public class Example1 {

    public void age(int age) {
        System.out.println("int age="+age);
    }
    public void age(Integer age) {
        System.out.println("Integer age="+age);
    }

    public void example2() throws Exception {
        Example1 obj = new Example1();
        Method m1 = obj.getClass().getMethod("age", int.class);
        m1.invoke(obj, new Integer(27));  //int age=27
        m1.invoke(obj, 28); //int age=28
        Method m2 = obj.getClass().getMethod("age", Integer.class);
        m2.invoke(obj, new Integer(27));  //Integer age=27
        m2.invoke(obj, 28); //Integer age=28
    }

    public void func(String[] args) {
        System.out.println((args == null) ? "null" : args.length);
    }

    public void example1() throws Exception {
        Example1 obj = new Example1();
        Method m = obj.getClass().getMethod("func", String[].class);
        m.invoke(obj, new String[1]); // null
        m.invoke(obj, new Object[] {new String[] {"a", "b"}}); // 2
        m.invoke(obj, (Object) new String[] {"a", "b"}); // 2
        m.invoke(obj, new String[] {"a"});  // IllegalArgumentException
        m.invoke(obj, new String[] {"a", "b"}); // IllegalArgumentException
        m.invoke(obj, new String[2]);  // IllegalArgumentException
    }

    public static void main(String[] args) throws Exception {
        
    }

}