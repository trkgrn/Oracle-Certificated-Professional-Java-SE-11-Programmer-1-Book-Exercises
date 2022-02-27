package com.company.chapter7;

import java.util.List;

public class Overloading {

    // Overloading Methods

    public void fly(int numMiles) {}
    public void fly(short numFeet) {}
    public boolean fly() { return false; }
    public void fly(int numMiles, short numFeet) {}
    public void fly(short numFeet, int numMiles) {} // DOES COMPILE - same parameter list but different sorted

    public void fly2(int numMiles) {}
 //   public int fly2(int numMiles) {} // DOES NOT COMPILE - same parameter list

    public void fly3(int numMiles) {}
//    public static void fly3(int numMiles) {} // DOES NOT COMPILE - same parameter list


    public void fly4(int numMiles) {
        System.out.println("int");
    } // same parameter size but different type
    public void fly4(short numFeet) {
        System.out.println("short");
    }

    // Varargs

    public void fly5(int lengths){}
    public void fly5(int[] lengths){}
  //  public void fly5(int... lengths){} // DOES NOT COMPILE
    public void fly5(int start, int... lengths){}
  //  public void fly5(int start, int[] lengths){} // DOES NOT COMPILE

    // Autoboxing

    public static void fly6(int numMiles){}
    public static void fly6(Integer numMiles){}

    // Reference Types
    public void fly7(String s){}
    public void fly7(Object o){}

    // Primitives

    public void fly8(int i){}
    public void fly8(long l){}

    public void tryFly8(){
        fly8(8);
        fly8(8L);
    }

    // Generics

    public void walk(List<String> strings) {}
 //   public void walk(List<Integer> integers) {} // DOES NOT COMPILE

    // Arrays

    public static void walk2(int[] ints) {}
    public static void walk2(Integer[] integers) {}


}
