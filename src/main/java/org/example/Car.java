package org.example;

public class Car {
    Engine engine;

    public void setEngine(Engine engine) {
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
