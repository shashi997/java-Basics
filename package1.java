
// Here package1 is not a package of tools, so it cannot access the files in that folder in order to do that we need to 
// import the tools.calc , tools.advcalc  or tools.* package inside the package1 java file.

// import tools.calc1;      // in order to create objects and use methods of that class need to import them b/c 
// import tools.advcalc1; 
// there are in different folder/package, if there in same folder no need for import 
// we can directly create the objects and use the methods and variables without importing.
// we can import one at a time (or) import all files in that package at a single time by

import tools.*;  // we can use any of the methods for importing.
// tools.* means all the files not all the folders suppose there is a folder "scical" and inside contain java files
// we cannot use them we can use them by import.tools.scical.*;  . 

import java.util.ArrayList;    // it is built in package inside of java.

public class package1 {
    public static void main(String[] args) {
     
        calc1 obj = new calc1();  // creating a object from Calc class.
        int r1 = obj.add(52,25);
        int r2 = obj.sub(64,51);

        System.out.println(r1 + "  " + r2);

        System.out.println();

        advcalc1 obj1 = new advcalc1();    

        int r3 = obj1.add(52,25);
        int r4 = obj1.sub(64,51);
        int r5 = obj1.multi(5,7);
        int r6 = obj1.div(48,4);

        System.out.println(r3 + "  " + r4 + "  " + r5 + "  " + r6);

        ArrayList list = new ArrayList();  // in order to use the array list we need to import java.util.ArrayList;

        // the system.out.println is inside of a package of java.lang.System; there is no need for mentioning it b/c
        // by default every java file has java.lang.*; which means every class in lang will be imported by default.
    }
}

// if you want to create a package and work with others give a unique name to that package so everyone can identify what that it does.
// package com.google.calculation etc.. like that.
// also you can download and use other people libraries/packages and create our application 
// we can download in other's code in MVN REPOSITORY or github or any other sources we can use them. 
