package com.java.learning.basictype;

public class Example1 {

    /**
     * 对于基本类型，==判断的是值相等
     * 对于对象，判断的是对象的引用是否一样
     * 
     */
    public static void method1(){
        String a = "ssssssssssss";
        String b = "ssssssssssss";
        System.out.println(a == b); // true
        Integer c = 100;
        Integer d = 100;
        System.out.println(c == d); // true
        Integer e = 1000;
        Integer f = 1000;
        System.out.println(e == f); // false
        int g = 1000;
        int h = 1000;
        System.out.println(g == h); // true

        System.out.println(3*0.1 == 0.3); // false 浮点数运算会损失精度
    }

    public static void method2() {
        short s1 = 1;
        // s1 = s1 + 1; 因为显示写 1 就是int，= 右边运算结果是int，将int赋给short在 编译器就过不了
        s1 += 1; // 这里的 += 在编译器中会进行 特殊处理，a+=b进行了强制类型转换，和 a=(type a)( (type b) a+b )是等价的
        int i = 1;
        char c = 'a';
        i = i + c;
    }

    public static void method3() {
        // float f = 3.4 浮点数单精度必须写上f，直接写就是double了
        float f = 1.2F;
        double d = 1.2;
    }

    public static void main(String[] args) {
        
    }

}