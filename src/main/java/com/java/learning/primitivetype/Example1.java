package com.java.learning.primitivetype;

public class Example1 {

    /**
     * 对于基本类型，==判断的是值相等
     * 对于对象，判断的是对象的引用是否一样
     * 因为基本包装类的cache为 -128 ~ 127
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
        System.out.println(e == 1000); // true 自动拆箱成为int后进行比较
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
        System.out.println(f == d);
        byte a = 1;
        short b = 1;
        int i = 1;
        long l = 1L;
        System.out.println(a == b);
        System.out.println(b == i);
        System.out.println(i == l);
    }

    public static void method4(){
        double d1 = Double.NaN;
        double d2 = Double.NaN;
        double d3 = d1;
        System.out.println(d1 == d2);
        System.out.println(d1 == d3);
    }

    public static void method5() {
        Integer a = 200;
        Integer b = 300;
        Integer c = 500;
        Integer d = a + b;
        System.out.println(c == d); // false 比较对象的引用
        System.out.println(c == (a + b)); // true == 任意一边有运算则进行自动拆箱后进行值比较
        System.out.println(c.equals(a + b)); // true 比较值

        Long e = 500L;
        Long f = 300L;
        System.out.println(e.equals(a + b)); // false 运算后的结果为 int 的 500
        System.out.println(e.equals(500)); // false
        System.out.println(e.equals(500L)); // true
        System.out.println(e.equals(a + f)); // true
        long g = 500L;
        int h = 500;
        System.out.println(g == h); // true
    }

    public static void method6() {
        Integer i = 1;
        i += 1;
        // 反编译结果展示了自动拆装箱过程，说明自动拆装箱发生在编译过程
        Integer integer = Integer.valueOf(1);
        integer = Integer.valueOf(integer.intValue() + 1);
    }

    public static void main(String[] args) {
        method5();
    }

}