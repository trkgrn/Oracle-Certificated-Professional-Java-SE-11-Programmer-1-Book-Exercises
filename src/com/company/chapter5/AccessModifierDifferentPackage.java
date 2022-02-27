package com.company.chapter5;
// Created for Chapter7.

public class AccessModifierDifferentPackage {

    String defaultStr = "Default Access";
    private  String privateStr = "Private Access";
    protected String protectedStr = "Protected Access";
    public  String publicStr = "Public Access";

    private void  privateMethod()
    {
        System.out.println("It's a private method");
    }

    void defaultMethod()
    {
        System.out.println("It's a default method");
    }

    protected void protectedMethod()
    {
        System.out.println("It's a protected method");
    }

    public void publicMethod()
    {
        System.out.println("It's a public method");
    }

}
