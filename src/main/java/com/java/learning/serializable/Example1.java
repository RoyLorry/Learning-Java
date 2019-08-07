package com.java.learning.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

final class Singleton implements Serializable {
    private Singleton() {}

    public final static Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}


/**
 * 用于单例的序列化反序列化演示
 */

 public class Example1 {
     public static void main(String[] args) throws IOException, Exception {
         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.serial"));
         Singleton st = Singleton.getInstance();
         oos.writeObject(st);
         oos.close();

         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.serial"));
         Singleton st1 = (Singleton) ois.readObject();
         System.out.println(st == st1);
     }
 }