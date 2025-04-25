package com.priya.Abstractcls;

public class Daughter extends Parent {

    public Daughter(int age){
      super(age);
    }
    @Override
    void career() {
        System.out.println("Im going to be Coder");

    }

    @Override
    void partner() {
        System.out.println("I love Arjun");

    }
}
