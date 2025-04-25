package com.priya.Abstractcls;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(22);
        son.career();
        son.normal();


       Daughter daughter = new Daughter(21);
       daughter.career();

       //Parent.hello();



       //Parent mom=new Parent(); C.E: we cant create obj of an abstract cls
    }
}
