package com.java.learning.string;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRandom {
    public static int createRandom() {
        Random random = new Random(1000);
        random.nextInt();
        return random.nextInt();
    }
    public static void main(String[] args) {
        /* for (int i = 0; i < 10; i++) {
            System.out.println("index["+i+"]="+createRandom());
        } */
        String msg = null;
        String email = "nirmala@swin.edu.au";
        Pattern p = Pattern.compile("[a-zA-Z0-9](@[a-zA-Z0-9-.])");
        Matcher m = p.matcher(email);
        while (m.find()) {
            msg = m.group();
            System.out.println(msg);
        }
    }
}