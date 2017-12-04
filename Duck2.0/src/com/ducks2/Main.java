package com.ducks2;

import com.ducks2.children.CitizenDuck;
import com.ducks2.children.ToyDuck;
import com.ducks2.parent.Duck;
import com.ducks2.parent.children.FlyByHand;
import com.ducks2.parent.children.FlyWithWings;
import com.ducks2.parent.children.MuteQuack;
import com.ducks2.parent.children.Squeak;

public class Main {

    public static void main(String[] args) {

        Duck duck = new Duck();

        Duck citizenDuck = new CitizenDuck();
        citizenDuck.setFlyable(new FlyWithWings());
        citizenDuck.setQuackable(new Squeak());

        Duck toyDuck = new ToyDuck();
        toyDuck.setFlyable(new FlyByHand());
        toyDuck.setQuackable(new MuteQuack());

        Main main = new Main();
        main.doSomething(citizenDuck);
        main.doSomething(toyDuck);

    }
    public void doSomething(Duck duck){
        System.out.println("***********************");
        duck.quack();
        duck.fly();
        duck.display();
        System.out.println("***********************");
        System.out.println();
    }
}
