package org.example;

public class PetrolEngine implements Engine{

    PetrolEngine(){
        System.out.println("petrol costructor");
    }
    @Override
    public boolean start() {
        return true;
    }
}
