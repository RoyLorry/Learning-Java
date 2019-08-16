package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    // 请使用迭代器删除元素
    // 或使用for循环倒序遍历删除
    public void remove1(ArrayList<Integer> list) {
        for (Integer a : list) {
            if (a < 10) {
                list.remove(a);
            }
        }
    }

    public void copyMethod() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>(list1);
        list2.set(0, 0);

        System.out.println(list1.get(0));
        System.out.println(list2.get(0));

        // subList操作产生的是视图，所有操作作用于原集合
        List<Integer> list3 = list1.subList(0, list1.size());
        list3.set(0, 0);

        System.out.println(list1.get(0));
        System.out.println(list3.get(0));
    }

    public void delete(List list, int fromIndex, int toIndex) {
        // 最优雅的区间删除方式
        list.subList(fromIndex, toIndex).clear();;
        // 或者通过倒序遍历进行remove操作
    }

    public static void main(String[] args) {
        
    }
}