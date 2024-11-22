package org.example;

public class Car {
    Engine engine;

    Car(){
        System.out.println("Car constructor");
    }
    Car(Engine engine){
        System.out.println("Car Para constructor");
        this.engine = engine;
    }
    public void setEngine(Engine engine) {
        System.out.println("setter");
        this.engine = engine;
    }

    void drive(){
        boolean start = engine.start();
        if(start){
            System.out.println("Car started....");
        }
        else{
            System.out.println("Car not started....");
        }
    }
}
