package com.mojo;

public class Main {

    public static void main(String[] args) {

//        Declaring And InitializingString type of variable
             String myName = "Adwait";

//         Printing variableSystem.out.println(myName);

//        Storing copy of myName in other variable
        String myNameCopy = myName;
        System.out.println(myNameCopy);

//        Re-Declaration of variable
        myName = "another name";
        System.out.println(myName);

//      passing command line argument in variable and printing it
        String arg1 = args[0];

        System.out.println(arg1);
    }
}
