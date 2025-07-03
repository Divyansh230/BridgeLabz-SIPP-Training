package com.Inheritance.AnimalHeirarichy;

public class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }
    void makeSound(){
        System.out.println("tweet tweet");
    }
}
