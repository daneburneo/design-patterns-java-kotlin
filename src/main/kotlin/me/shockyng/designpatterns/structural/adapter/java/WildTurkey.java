package me.shockyng.designpatterns.structural.adapter.java;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Turkey: Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Turkey: I'm flying a short distance");
    }
}
