package com.java.learning.string;

public class Example1 {
    
    public static void method1() {
        String s1 = "aaa";
        int capacity = 300; // default as 16
        StringBuilder s2 = new StringBuilder(capacity);
    }

    public static void method2() {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3); // false
    }

    public static void method3() {
        String s1 = "abc";
        System.out.println(s1 == s1.substring(0)); // true
        System.out.println("bc" == s1.substring(1)); // false

        String s2 = "12";
        String s3 = "1" + 2;
        int i = 2;
        String s3_1 = "1" + i;
        System.out.println(s2 == s3); // true, 字面量说明的在编译期就执行了，并存入常量池
        System.out.println(s2 == s3_1); // false, 运算在运行时才产生对象在堆中，因此引用不相等
        /**
         * String str1 = "12";
         * String str2 = "12";
         * byte b = 2;
         * String str3 = "1" + b;
         * System.out.println((str1 == str2));
         * System.out.println((str1 == str3));
         */

        String s4 = "12";
        String s5 = "2";
        String s6 = "1" + s5;
        final String s7 = "2";
        String s8 = "1" + s7;
        System.out.println(s4 == s6); // false
        System.out.println(s4 == s8); // true 因为final在编译期直接被替换为真实的值
        /**
         * 综上，基本上来说只有在编译期能确定值的String，引用才是相等的，同在常量池当中
         * 
         * 上方编译后的值为
         * String str4 = "12";
         * String str5 = "2";
         * String str6 = "1" + str5;
         * s7因为没有再使用直接被优化掉了
         * String str7 = "12";
         * System.out.println((str4 == str6));
         * System.out.println((str4 == str7));
         */
    }

    public static void method4() {
        String s1 = "ab";
        String s2 = "a";
        String s3 = "b";
        String s23 = s2 + s3;
        System.out.println(s23 == s1);
        System.out.println(s23.intern() == s1);
        System.out.println(s23 == s1.intern());
        System.out.println(s23.intern() == s1.intern());
        // intern方法返回在常量池当中与字符串值相等的值的引用，找不到则先在常量池中创建该值再返回
    }

    public static void main(String[] args) {
        method4();
    }
}