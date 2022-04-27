package me.shockyng.designpatterns.structural.adapter.kotlin

class MallardDuck: Duck {

    override fun quack() = println("Duck: Quack")
    override fun fly() = println("Duck: I'm flying")
}