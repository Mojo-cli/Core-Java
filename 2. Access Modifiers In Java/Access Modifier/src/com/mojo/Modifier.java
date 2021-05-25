package com.mojo;

public class Modifier {

//   Main Method Of Class Modifier
    public static void main(String[] args) {
        mojo();
        stat();
        geek();
    }

//  Mojo Method Of Class Modifier Using Public Access Modifier
    public static void mojo() {
        System.out.println("Hello From mojo Method Of Class Modifier ! ");
    }

//    Stat Method Of Class Modifier Using Private Access Modifier
    private static void stat() {
        System.out.println(" This Is Private Method From Class Modifier ! ");
}

//    Geek Method Of Class Modifier Using Static Non-Access Modifier
    public static void geek(){
        System.out.println(" Try to check output of this method by deleting static keyword from above line... ");
    }
}
