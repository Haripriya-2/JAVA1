package com.priya.Abstractcls;

public abstract class Parent {
    int age;

    final int value;



    public Parent(int age){
        this.age=age;
        value=3245;
    }
    //abstract Parent();//we cant create abstract constructor.bcz it dont have body.
    //we cant create abstract static methods.

    static void hello(){
        System.out.println("Hii");
    }

    void normal(){
        System.out.println("This is a normal method");
    }

    abstract void career();
    abstract void partner();

}
