package com.java.learning.basicclass;

public class Example2 {
    
    public class Base {
        public Base() {
            test();
        }

        public void test() {
            System.out.println("Base test");
        }
    }

    public class Child extends Base {
        private int a = 123;

        public Child() {}

        public void test() {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Example2 e = new Example2();
        Child c = e.new Child();
        c.test();
    }
    
}