package com.priya.interfaces;

public class Main {
    public static void main(String[] args) {
        //Car car=new Car();

//        car.acc();
//        car.start();
//        car.stop();

//        Media carmedia=new Car();
//        carmedia.stop();//stops engine here

        NiceCar car=new NiceCar();
        car.start();
        car.StartMusic();
        car.UpgradeEngine();
        car.start();



    }
}
