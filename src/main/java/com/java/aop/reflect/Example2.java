package com.java.aop.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Example2 {
    private static final Integer KEY_EXIT = 1024;

    private static void invok1() throws NoSuchFieldException, IllegalAccessException {
        System.out.println("invok1->" + Example2.KEY_EXIT);
        Field field = Example2.class.getDeclaredField("KEY_EXIT");
        field.setAccessible(true);
        field.set(null, 1000);
        System.out.println("invok1-<" + Example2.KEY_EXIT);
    }

    private static void invok2() throws NoSuchFieldException, IllegalAccessException {
        System.out.println("invok2->" + Example2.KEY_EXIT);
        Field field = Example2.class.getField("KEY_EXIT");
        field.set(null, 512);
        System.out.println("invok2-<" + Example2.KEY_EXIT);
    }

    private static void invok3() throws NoSuchFieldException, IllegalAccessException {
        System.out.println("invok3->" + Example2.KEY_EXIT);
        Field field = Example2.class.getDeclaredField("KEY_EXIT");
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        field.set(null, 256);
        System.out.println("invok3-<" + Example2.KEY_EXIT);
    }

    public static void main(String[] args) throws Exception {
        // invok1();
        // invok2();
        invok3();
    }
}