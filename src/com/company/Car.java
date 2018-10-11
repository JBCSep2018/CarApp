package com.company;

public class Car extends Vehicle {
    public String display(){
        return String.format("This is a %s %s.",this.getMake(),this.getModel());   }
}
