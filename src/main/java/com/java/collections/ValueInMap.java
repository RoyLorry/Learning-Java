package com.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ValueInMap {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Integer>> keyAndIndexMap = new HashMap<>();
        SortedSet<Integer> sortedKey = new TreeSet<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        keyAndIndexMap.put(1, list);
        ArrayList<Integer> list2 = keyAndIndexMap.get(1);
        list2.add(2);
        ArrayList<Integer> list3 = keyAndIndexMap.get(1);
        System.out.println(list.size());
        System.out.println(list2.size());
        System.out.println(list3.size());

        sortedKey.add(2);
        sortedKey.add(5);
        sortedKey.add(1);
        sortedKey.add(3);
        Iterator<Integer> it = sortedKey.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}