package me.shockyng.designpatterns.structural.adapter.java;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Duck: Quack");
    }

    @Override
    public void fly() {
        System.out.println("Duck: I'm flying");
    }
}
