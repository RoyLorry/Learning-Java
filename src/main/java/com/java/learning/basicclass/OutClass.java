package com.java.learning.basicclass;

import java.util.ArrayList;
import java.util.List;

// class OutClass {
//     class InnerClass {}
// }

// class ChildInnerClass1 extends OutClass.InnerClass {}

// class ChildInnerClass2 extends OutClass.InnerClass {
//     public ChildInnerClass2() {
//         super();
//     }
// }

// class ChildInnerClass3 extends OutClass.InnerClass {
//     public ChildInnerClass3(OutClass outClass) {
//         super();
//     }
// }

// 只有下面这个先声明了OutClass对象
// class ChildInnerClass4 extends OutClass.InnerClass {
//     public ChildInnerClass4(OutClass outClass) {
//         outClass.super();
//     }
// }

public class OutClass {

    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList(){};
        List list3 = new ArrayList(){{}};
        List list4 = new ArrayList(){{}{}{}};
        System.out.println(list1.getClass().getName());
        System.out.println(list2.getClass().getName());
        System.out.println(list3.getClass().getName());
        System.out.println(list4.getClass().getName());
    }
}