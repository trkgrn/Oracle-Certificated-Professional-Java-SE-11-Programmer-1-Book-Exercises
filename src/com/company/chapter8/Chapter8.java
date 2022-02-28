package com.company.chapter8;

public class Chapter8 {

    public static void main(String[] args) {

        var lion = new Lion(5);
        lion.setProperties(3, "kion");
        lion.roar();

        // calling the super Reference
        System.out.println(new Bat().getType());

        new Beetle().printData();

        // Constructors

        new Constructors((long)1.0,"Long Constructor"); // Default - int - long
        new Zebra(); // Animal Constructor - age = 4

        System.out.println("C");
        new Hippo();
        new Hippo();
        new Hippo();

    }
}
