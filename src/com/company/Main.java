package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello World";

        //        1) UpperCase Method.
        System.out.println(s1.toUpperCase());
        //        2) LowerCase Method.
        System.out.println(s1.toLowerCase());
        //        3) Length Method.
        System.out.println(s1.length());
        //        4) isBlank Method.
//        System.out.println(s1.isBlank());
        //        5) charAt Method.
        System.out.println(s1.charAt(2));
        //        6) indexOf Method.
        System.out.println(s1.indexOf("W"));
        //        7) lastIndexOf Method.
        System.out.println(s1.lastIndexOf('l'));
        //        8) Concat Method.
        System.out.println(s1.concat("\tAdwait Here!"));
    }
}
