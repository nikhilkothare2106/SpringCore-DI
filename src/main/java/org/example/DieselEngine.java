package org.example;

public class DieselEngine implements Engine{

    DieselEngine(){
        System.out.println("Disel Constructor");
    }
    @Override
    public boolean start() {
        return true;
    }
}
