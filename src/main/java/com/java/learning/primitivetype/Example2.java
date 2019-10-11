package com.java.learning.primitivetype;

public class Example2 {

    /**
     * 实用的字符串反转
     * @param str
     * @return
     */
    public static String reverse1(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return new StringBuffer(str).reverse().toString();
    }

    /**
     * 递归实现的字符串反转
     * @param str
     * @return
     */
    public static String reverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    /**
     * 检查回文，当然也可以使用StringBuilder进行字符串反转后比较两字符串
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str) {
        if (null == str) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 -i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
    }
}