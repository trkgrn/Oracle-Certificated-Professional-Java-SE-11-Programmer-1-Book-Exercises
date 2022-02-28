package com.company.chapter8;

public class Insect {
 protected int numberOfLegs = 4;
 String label = "buggy";
 }

 class Beetle extends Insect {

    protected int numberOfLegs = 6;
    short age = 3;

 public void printData() {
         System.out.print(this.label);
         System.out.print(super.label);
         System.out.print(this.age);
     //    System.out.print(super.age); // DOES NOT COMPILE
         System.out.println(numberOfLegs);
         }

 }
