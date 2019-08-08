package com.java.learning.generics;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Example2 {

    /**
     * 通过反射获取方法然后使用方法
     */
    public static void reflectAdd() throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>(); // 正规途径
        list.add(1); // 反射大法
        Method m = list.getClass().getMethod("add", Object.class);
        m.invoke(list, 2);
        m.invoke(list, 3.21);
        m.invoke(list, "对不起，我是字符串");
        m.invoke(list, new Date());
        for (Object x : list) {
            System.out.println(x.getClass().getName() + ":\t" + x);
        }
    }

    class Foo<T extends CharSequence> {
        public List<Bar> children = new ArrayList<Bar>();
        public List<StringBuilder> foo(List<String> foo) {
            return null;
        }

        public void bar(List<? extends String> param) { // empty
        }
    }

    class Bar extends Foo<String> {}

    public static void method1() throws NoSuchFieldException, NoSuchMethodException {
        ParameterizedType type = (ParameterizedType) Bar.class.getGenericSuperclass();    
        System.out.println(type.getActualTypeArguments()[0]);    
        ParameterizedType fieldType = (ParameterizedType) Foo.class.getField("children").getGenericType();    System.out.println(fieldType.getActualTypeArguments()[0]);    
        ParameterizedType paramType = (ParameterizedType) Foo.class.getMethod("foo", List.class).getGenericParameterTypes()[0];    
        System.out.println(paramType.getActualTypeArguments()[0]);    
        System.out.println(Foo.class.getTypeParameters()[0].getBounds()[0]); 
    }

    public static void main(String[] args) throws Exception {
        method1();
    }
}