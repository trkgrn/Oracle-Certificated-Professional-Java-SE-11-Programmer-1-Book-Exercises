package com.company.chapter8;

public class BigCat {
    public double size;
}

 class Jaguar extends BigCat { // Jaguar is a subclass (or child) class
    public Jaguar() {          // BigCat is a superclass
        size = 10.2;
    }
    public void printDetails() {
        System.out.println(size);
    }
}