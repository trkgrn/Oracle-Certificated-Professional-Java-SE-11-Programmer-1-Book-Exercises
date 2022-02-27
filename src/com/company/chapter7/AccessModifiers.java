package com.company.chapter7;

public class AccessModifiers {

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

    public AccessModifiers()
    {
        System.out.println("*** Constructor Front ***");
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
        System.out.println("*** Constructor End ***\n\n");
    }



}
