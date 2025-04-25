package com.priya.Abstractcls;

public class Son extends Parent{

    public Son(int age){
        super(age);
        System.out.println(age);
    }

    @Override
    void normal(){
        super.normal();
        System.out.println("Normal from son");
    }
    @Override
    void career() {
        System.out.println("Im going to be A DOCTOR");

    }

    @Override
    void partner() {
        System.out.println("I love Zoya");

    }
}
