package me.shockyng.designpatterns.structural.adapter.java;

public class App {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();

        Turkey turkey = new WildTurkey();
        turkey.fly();
        turkey.gobble();

        Duck wildTurkey = new TurkeyAdapter(turkey);

        testDuck(wildTurkey);
    }

    public static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
