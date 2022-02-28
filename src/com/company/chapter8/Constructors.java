package com.company.chapter8;

public class Constructors {

    private final int number;
    private final String str = "final string";
    private int number2;
    private final int number3;

    { // Final Field
        number=5;
     //   number = 7; // already have been assigned

    } // Final Field



    public Constructors()
    {
        System.out.println("Default Constructor");
        this.number3 = 3; // final variable assigned
    }
    public Constructors(int a, String s) {
        this(); // refers to constructor
        System.out.println(s);

    }
    public Constructors(long a, String s)
    {
        this( (int) a,"int Constructor"); // DOES COMPILE
        System.out.println(s);
       // this(); // DOES NOT COMPILE
    }

}
