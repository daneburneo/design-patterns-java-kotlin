package me.shockyng.designpatterns.structural.adapter.kotlin

class TurkeyAdapter(private val turkey: Turkey): Duck {

    override fun quack() = turkey.gobble()

    override fun fly() {
        repeat(5) {
            turkey.fly()
        }
    }
}