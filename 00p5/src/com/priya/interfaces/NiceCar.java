package com.priya.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player=new CDplayer();

    public NiceCar(){
        engine=new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void StartMusic(){
        player.start();
    }
    public void StoptMusic(){
        player.stop();
    }
    public void UpgradeEngine(){
        this.engine = new ElectricEngine();
    }




}
