package me.shockyng.designpatterns.structural.adapter.kotlin

class WildTurkey: Turkey {

    override fun gobble() = println("Turkey: Gobble")
    override fun fly() = println("Turkey: I'm flying a short distance")
}