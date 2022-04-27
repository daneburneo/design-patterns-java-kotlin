package me.shockyng.designpatterns.structural.adapter.kotlin

fun main() {
    val mallardDuck: Duck = MallardDuck()
    mallardDuck.fly()
    mallardDuck.quack()

    val wildTurkey: Turkey = WildTurkey()
    wildTurkey.fly()
    wildTurkey.gobble()

    // turkey -> turkeyAdapter -> duck
    val turkeyAdapter: Duck = TurkeyAdapter(wildTurkey)

    testDuck(turkeyAdapter);
}

fun testDuck(duck: Duck) {
    duck.fly()
    duck.quack()
}