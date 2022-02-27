package com.company.chapter7;
import com.company.chapter5.AccessModifierDifferentPackage;

import java.awt.*;
import java.util.ArrayList;

public class Chapter7 {

    private static final int NUM_BUCKETS = 45;
    private static final ArrayList<String> values = new ArrayList<>();

    // Static Initialization

    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;
    static {
        NUM_SECONDS_PER_MINUTE = 60; // initialization
        NUM_MINUTES_PER_HOUR = 60; // initialization
    }
    static {
        NUM_SECONDS_PER_HOUR
                = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR; // initialization
    }

 private static int one;
 private static final int two;
 private static final int three = 3; // initialization
 // private static final int four; // DOES NOT COMPILE
    // 'four' variable is not initialized before runtime in or out of the static field.

 static {
         one = 1; // initialization
         two = 2; // initialization
        // three = 3; // DOES NOT COMPILE - already initialization
        //  two = 4; // DOES NOT COMPILE - already initialization
         one = 2; // DOES COMPILE - not final
         }



    //// RETURN TYPE ////

    public void walk1() {}
    public void walk2() { return; }
    public String walk3() { return ""; }
//    public String walk4() {} // DOES NOT COMPILE - return statement is missing
//    public walk5() {} // DOES NOT COMPILE - return type is missing
//    public String int walk6() { } // DOES NOT COMPILE - two return type
//    String walk7(int a) { if (a == 4) return ""; } // DOES NOT COMPILE - a!=4 return is not working

    //// Optional Exception List ////

    public void zeroExceptions() {}
    public void oneException() throws IllegalArgumentException {}
    public void twoExceptions() throws IllegalArgumentException, InterruptedException {}

    //// Working with Varargs ////

    public void varargs1(int... nums){}
    public void varargs2(int start, int... nums){}
//    public void varargs3(int... nums, int start){} // DOES NOT COMPILE
//    public void varargs4(int... nums, int... start){} // DOES NOT COMPILE - too many varargs

    public static void exampleVarargs(int start, int... nums){
        System.out.println(nums.length);
    }

    // Passing Data among Methods

    public static void speak(String name){
     name = "Sparky";
    }

    public static void speakSB(StringBuilder name){
        name.append(" Stark");
    }

    public static void main(String[] args) {
        // Access Modifiers

        AccessModifiers accessModifiersObject = new AccessModifiers();

    //    accessModifiersObject.privateMethod(); // private method
        accessModifiersObject.defaultMethod();
        accessModifiersObject.protectedMethod();
        accessModifiersObject.publicMethod();

        // Working with Varargs

        exampleVarargs(1); // 0
        exampleVarargs(1,2); // 1
        exampleVarargs(1,2,3,4); // 3
        exampleVarargs(1,new int[]{2,3,4}); // 3

        // Applying Access Modifiers

        AccessModifierDifferentPackage test = new AccessModifierDifferentPackage();
        System.out.println(test.publicStr); // Public Access
        test.publicMethod(); // It's a public method.
   //     test.privateMethod(); // DOES NOT COMPILE
   //     test.defaultMethod(); // DOES NOT COMPILE
   //     test.protectedMethod(); // DOES NOT COMPILE

        OtherClass test2 = new OtherClass();
        test2.publicMethod();
   //     test2.protectedMethod(); // outside package - extend required 
        //      test2.privateMethod(); // outside package - Package Private
        //      test2.defaultMethod(); // outside package - Package Private

        // Applying the static Keyword

        Koala.test(new String[0]); // call static method

        Koala k = new Koala();
         System.out.println(k.count); // k is a Koala
         k = null;
         System.out.println(k.count); // k is still a Koala

        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count); // 5

        // Static vs Instance

        Static.first();
        Static.second();
       // Static.third(); // DOES NOT COMPILE
        new Static().third(); // non static method do require any instances of the class

        Gorilla gorilla = new Gorilla();
        Gorilla gorilla1 = new Gorilla();
        Gorilla gorilla2 = new Gorilla();
        System.out.println(Gorilla.count); // 3

   //     NUM_BUCKETS = 5; // don't change final variable
        values.add("changed");
        values.set(0,"re change");
        System.out.println(values.get(0));

    // Passing Data among Methods

        String name = "Webby";
        speak(name);
        System.out.println(name); // Webby

        String name2 = new String("Webby");
        speak(name2);
        System.out.println(name2); // Webby

        StringBuilder name3 = new StringBuilder("Tony");
        speakSB(name3);
        System.out.println(name3); // Tony Stark


 }
}
