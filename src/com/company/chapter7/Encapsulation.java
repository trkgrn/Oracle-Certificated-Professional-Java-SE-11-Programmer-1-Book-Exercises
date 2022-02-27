package com.company.chapter7;

public class Encapsulation {

    // Encapsulation Example 1

    private int data;
    private String name;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Encapsulation Example 2

    private int numEggs; // instance variable is private
    // Only methods can retrieve and update the value.
    public void layEgg() {
        numEggs++;
    }
    public void printEggCount() {
        System.out.println(numEggs);
    }

}
