package com.company.chapter8;

public class Animal {
    private int age;
    protected String name;

    static {
        System.out.print("A");
    }

    public Animal() {

    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // Accesing the this Reference

    //    age = age; // reference to parameter variable
        this.age = age; // refers to instance variable
    }

    public Animal(int age){
        super(); // Refers to java.lang.Object
        System.out.println("Animal Constructor - age = "+age);
    }



}

class Lion extends Animal {
    public Lion(int age) {
        super(age);
    }

    public void setProperties(int age, String n) {
        setAge(age);
        name = n;
    }
    public void roar() {
        System.out.print(name + ", age " + getAge() + ", says: Roar!");
    }

    public void roar2(){
    //    System.out.println("Lion age: "+age); // DOES NOT COMPILE
        // private variable required to getter and setter
    }

}

class Zebra extends Animal {
    public Zebra(int age) {
        super(age); // Refers to constructor in Animal
    }
    public Zebra() {
        this(4); // Refers to constructor in Zebra with int argument
    }
}

class Hippo extends Animal {
    static { System.out.print("B"); }

    public Hippo(int age) {
        super(age);
    }
    public Hippo()
    {
        super();

    }
}
